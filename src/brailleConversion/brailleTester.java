package brailleConversion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class brailleTester {

	@Test
	public void test() {
		ArrayList<Cell> c1 = new ArrayList<Cell>();
		brailleConverter bC = new brailleConverter();
		c1 = bC.convert("adam");
		for (int i=0; i < c1.size(); i++){
			System.out.println("============================");
			System.out.println(c1.get(i).getPos1());
			System.out.println(c1.get(i).getPos2());
			System.out.println(c1.get(i).getPos3());
			System.out.println(c1.get(i).getPos4());
			System.out.println(c1.get(i).getPos5());
			System.out.println(c1.get(i).getPos6());
			System.out.println("============================");
		}
	}

}
