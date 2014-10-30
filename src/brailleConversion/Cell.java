package brailleConversion;

public class Cell {
	public boolean p1, p2, p3, p4, p5, p6;
	
	public Cell(){
		p1 = false; p2 = false; p3 = false; p4 = false; p5 = false; p6 = false;
	}
	
	//set methods
	public void setPos1(int val){ if (val == 1){p1 = true;} else { p1 = false; }}
	public void setPos2(int val){ if (val == 1){p2 = true;} else { p2 = false; }}
	public void setPos3(int val){ if (val == 1){p3 = true;} else { p3 = false; }}
	public void setPos4(int val){ if (val == 1){p4 = true;} else { p4 = false; }}
	public void setPos5(int val){ if (val == 1){p5 = true;} else { p5 = false; }}
	public void setPos6(int val){ if (val == 1){p6 = true;} else { p6 = false; }}
	
	//Get methods
	public boolean getPos1(){ return p1; }
	public boolean getPos2(){ return p2; }
	public boolean getPos3(){ return p3; }
	public boolean getPos4(){ return p4; }
	public boolean getPos5(){ return p5; }
	public boolean getPos6(){ return p6; }
	
	public boolean isSpace(){
		if (p1 == false && p2 == false && p3 == false && p4 == false && p5 == false && p6 == false){
			return true;
		}
		return false;
	}
	
	
}
