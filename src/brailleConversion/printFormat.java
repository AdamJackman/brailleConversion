package brailleConversion;

import java.util.ArrayList;

public class printFormat {
	//the amount of cells in a row
	private int ROWSIZE = 8;

	
	/**
	 * converts the cell list into row by row print head instructions
	 * @param cL - takes in the cell List as povided by the braille converter
	 */
	public void printFormatted(ArrayList<Cell> cL){
		
		int counter=0;
		// need to know the number of row in full
		// also need to know the number of cells in the last row
		int rows = (int) cL.size() / ROWSIZE;
		int remainder = cL.size() % ROWSIZE;
		
		
		//for rows in cL
		for (int row=0; row<rows; row++){ 
			//for the 3 rows in each cell
			System.out.println("==========================================================");
			for (int i=0; i<3; i++){
				
				//--------------------------
				//reset the head to far left
				//System.out.println();
				//--------------------------
				for (int j=0; j<ROWSIZE; j++){
					
					
					//if the first row
					if(i == 0){
						if (cL.get(counter+j).getPos1() == true){
							//print onto position 1
							System.out.print(".");
						}
						else{
							//skip a position
							System.out.print(" ");
						}
						if (cL.get(counter+j).getPos2() == true){
							//print onto position 2
							System.out.print(".");
						}
						else{
							//skip a position
							System.out.print(" ");
						}
					}
					//if the second row
					else if(i == 1){
						if (cL.get(counter+j).getPos3() == true){
							//print onto position 3
							System.out.print(".");
						}
						else{
							//skip a position
							System.out.print(" ");
						}
						if (cL.get(counter+j).getPos4() == true){
							//print onto position 4
							System.out.print(".");
						}
						else{
							//skip a position
							System.out.print(" ");
						}
					}
					//else the third row
					else{
						if (cL.get(counter+j).getPos5() == true){
							//print onto position 5
							System.out.print(".");
						}
						else{
							//skip a position
							System.out.print(" ");
						}
						if (cL.get(counter+j).getPos6() == true){
							//print onto position 6
							System.out.print(".");
						}
						else{
							//skip a position
							System.out.print(" ");
						}
					}	
						
					//--------------------------
					//increment the head to the right
					System.out.print("\t");
					//--------------------------	
						
				}
				//--------------------------
				//increment the head down one in cell row
				System.out.println();
				//--------------------------
			}
			counter+=ROWSIZE;
			//--------------------------
			//increment the head down one cell row
			//--------------------------
		} //end rows
		
		System.out.println("==========================================================");
		//for remainder in cL
		for (int i=0; i<3; i++){
			//--------------------------
			//reset the head to far left
			//--------------------------
		
			for (int rem=0; rem<remainder; rem++){
				
			//	System.out.println("row: " + i + " cell: " + rem);
				//if the cell first row
				if(i == 0){
					if (cL.get(counter+rem).getPos1() == true){
						System.out.print(".");
						//print onto position 1
					}
					else{
						//skip a position
						System.out.print(" ");
					}
					if (cL.get(counter+rem).getPos2() == true){
						System.out.print(".");
						//print onto position 2
					}
					else{
						//skip a position
						System.out.print(" ");
					}
				}
				//if the second cell row
				else if(i == 1){
					if (cL.get(counter+rem).getPos3() == true){
						System.out.print(".");
						//print onto position 3
					}
					else{
						//skip a position
						System.out.print(" ");
					}
					if (cL.get(counter+rem).getPos4() == true){
						System.out.print(".");
						//print onto position 4
					}
					else{
						//skip a position
						System.out.print(" ");
					}
				}
				//else the third cell row
				else{
					if (cL.get(counter+rem).getPos5() == true){
						System.out.print(".");
						//print onto position 5
					}
					else{
						//skip a position
						System.out.print(" ");
					}
					if (cL.get(counter+rem).getPos6() == true){
						System.out.print(".");
						//print onto position 6
					}
					else{
						//skip a position
						System.out.print(" ");
					}
				}
				
				//--------------------------
				//increment the head to the right
				System.out.print("\t");
				//--------------------------
			}
			//--------------------------
			//increment the head down one in cell row
			System.out.println();
			//--------------------------
		}
		
	}
	
}
