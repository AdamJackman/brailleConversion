package brailleConversion;

import org.zu.ardulink.Link;
import org.zu.ardulink.event.ConnectionEvent;
import org.zu.ardulink.event.ConnectionListener;
import org.zu.ardulink.event.DigitalReadChangeEvent;
import org.zu.ardulink.event.DigitalReadChangeListener;
import org.zu.ardulink.event.DisconnectionEvent;
import org.zu.ardulink.protocol.IProtocol;



public class tester {
	public static void main(String[] args) {
		Link link = Link.getDefaultInstance();
		
		link.addConnectionListener(new ConnectionListener() {
			
			public void disconnected(DisconnectionEvent e) {
				System.out.println("Board disconnected");
			}
			
			public void connected(ConnectionEvent e) {
				System.out.println("Board connected");
			}
		});
		
		boolean connected = link.connect("COM3", 9600); 
		if (!connected){
			System.out.println("No connection");
			System.exit(1);
		}

		System.out.println("start Listening");
		link.addDigitalReadChangeListener(new DigitalReadChangeListener() {
		
			@Override
			public void stateChanged(DigitalReadChangeEvent e) {
				System.out.println("PIN: " + e.getPin() + " STATE: " + e.getValue());
				System.out.println(e.getIncomingMessage());
			}
			
			@Override
			public int getPinListening() {
				return 3;
			}
		});

		
		
		link.sendCustomMessage("H");
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("sendPowerON");
				link.sendPowerPinSwitch(5, IProtocol.HIGH);
				Thread.sleep(2000);
				System.out.println("sendPowerOFF");
				link.sendPowerPinSwitch(5, IProtocol.LOW);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		link.disconnect();
	}
}
