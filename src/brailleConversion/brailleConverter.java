package brailleConversion;

import java.util.ArrayList;


public class brailleConverter {	
	
	/**
	 *  Converts a string into the braille cells associated to it
	 * @param s - s is the string you want to convert
	 * @return - returns an array list of cells
	 */
	
	public ArrayList<Cell> convert(String s){
		//create the cell list to populate
		ArrayList<Cell> cellList = new ArrayList<Cell>();
		
		//break the string into the words
		//for now force to lower case
		s.toLowerCase();
		String [] words = s.split(" ");
		
		//for the words in 
		for (int i=0 ; i < words.length; i++){
			//curr is the current cell
			Cell curr = new Cell();
			
			//first check the more advanced grade 2 scan
			grade2Scan(curr, words[i]);
			
			//not in grade 2 so split into grade 1
			if (curr.isSpace()){
				ArrayList<Cell> wordTranslate = new ArrayList<Cell>();
				//for the letters in word
				for(int j=0; j<words[i].length(); j++){
					//get the braille conversion
					Cell wCurr = new Cell();
					grade1Scan(wCurr, words[i].charAt(j));
					wordTranslate.add(wCurr);
				}
				for (int k=0; k<wordTranslate.size(); k++){
					// add the results to the real list
					cellList.add(wordTranslate.get(k));
				}
			}
					
			//analysis complete, add to the list if the cell is not a space
			if(!(curr.isSpace())){
				cellList.add(curr);
			}
			//add a space after the word
			Cell spaceCell = new Cell();
			cellList.add(spaceCell);
		}
		
		//return the cell list
		return cellList;
	}
	
	
	public void grade2Scan(Cell c, String s){
		//TODO implement after
	}
	
	public void grade1Scan(Cell c, char s){
		// computer no likey language
		if (s == 'a' || s=='1'){ c.setPos1(1);}
		else if (s == 'b' || s=='2'){ c.setPos1(1); c.setPos3(1);}
		else if (s == 'c' || s=='3'){ c.setPos1(1); c.setPos2(1);}
		else if (s == 'd' || s=='4'){ c.setPos1(1); c.setPos2(1); c.setPos4(1);}
		else if (s == 'e' || s=='5'){ c.setPos1(1); c.setPos4(1);}
		else if (s == 'f' || s=='6'){ c.setPos1(1); c.setPos2(1); c.setPos3(1);}
		else if (s == 'g' || s=='7'){ c.setPos1(1); c.setPos2(1); c.setPos4(1); c.setPos4(1);}
		else if (s == 'h' || s=='8'){ c.setPos1(1); c.setPos3(1); c.setPos4(1);}
		else if (s == 'i' || s=='9'){ c.setPos2(1); c.setPos3(1);}
		else if (s == 'j' || s=='0'){ c.setPos2(1); c.setPos3(1); c.setPos4(1);}
		else if (s == 'k'){ c.setPos1(1); c.setPos5(1);}
		else if (s == 'l'){ c.setPos1(1); c.setPos3(1); c.setPos5(1);}
		else if (s == 'm'){ c.setPos1(1); c.setPos2(1); c.setPos5(1);}
		else if (s == 'n'){ c.setPos1(1); c.setPos2(1); c.setPos4(1); c.setPos5(1);}
		else if (s == 'o'){ c.setPos1(1); c.setPos4(1); c.setPos5(1);}
		else if (s == 'p'){ c.setPos1(1); c.setPos2(1); c.setPos3(1); c.setPos5(1);}
		else if (s == 'q'){ c.setPos1(1); c.setPos2(1); c.setPos3(1); c.setPos4(1); c.setPos5(1);}
		else if (s == 'r'){ c.setPos1(1); c.setPos3(1); c.setPos4(1); c.setPos5(1);}
		else if (s == 's'){ c.setPos2(1); c.setPos3(1); c.setPos5(1);}
		else if (s == 't'){ c.setPos2(1); c.setPos3(1); c.setPos4(1); c.setPos5(1);}
		else if (s == 'u'){ c.setPos1(1); c.setPos5(1); c.setPos6(1);}
		else if (s == 'v'){ c.setPos1(1); c.setPos3(1); c.setPos5(1); c.setPos6(1);}
		else if (s == 'w'){ c.setPos2(1); c.setPos3(1); c.setPos4(1); c.setPos6(1);}
		else if (s == 'x'){ c.setPos1(1); c.setPos2(1); c.setPos5(1); c.setPos6(1);}
		else if (s == 'y'){ c.setPos1(1); c.setPos2(1); c.setPos4(1); c.setPos5(1); c.setPos6(1);}
		else if (s == 'z'){ c.setPos1(1); c.setPos4(1); c.setPos5(1); c.setPos6(1);}
		//Symbols
		else if (s == ','){ c.setPos3(1);}
		else if (s == ';'){ c.setPos3(1); c.setPos5(1);}
		else if (s == ':'){ c.setPos3(1); c.setPos4(1);}
		else if (s == '.'){ c.setPos3(1); c.setPos4(1); c.setPos6(1);}
		else if (s == '!'){ c.setPos3(1); c.setPos4(1); c.setPos5(1);}
		else if (s == '(' || s == ')'){ c.setPos3(1); c.setPos4(1); c.setPos5(1); c.setPos6(1);}
		else if (s == '?' || s == '\"'){ c.setPos3(1); c.setPos5(1); c.setPos6(1);}
		else if (s == '*'){c.setPos4(1); c.setPos5(1);}
		else if (s == '\"'){c.setPos4(1); c.setPos5(1); c.setPos6(1);}
		else if (s == '\''){ c.setPos5(1);}
		else if (s == '-'){ c.setPos5(1); c.setPos6(1);}
		//Signals, Signs if needed
		
	}
	
}
