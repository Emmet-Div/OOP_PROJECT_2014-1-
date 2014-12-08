//import javax.swing.*;
import java.util.*;

public class Cards2 {
	//attributes
	private int randRank;
	
	public static String toString(int randRank){
			Random rand = new Random();
			int value1;
			int randSuit=rand.nextInt(4)+1;
			String suit="";
			String rank="";
		switch(randSuit){
			case 1:  suit = "Hearts";
				break;
				case 2: suit = "Spades";
				break;
				case 3:  suit = "Diamonds";
				break;
				case 4: suit = "Clubs";
				break;
		}
		switch(randRank){
				case 1:	rank = "Ace";
				break;
				case 2:  rank = "2";
				break;
				case 3:  rank = "3";
				break;
				case 4: rank = "4";
				break;
				case 5: rank = "5";
				break;
				case 6: rank = "6";
				break;
				case 7: rank = "7";
				break;
				case 8: rank = "8";
				break;
				case 9: rank = "9";
				break;
				case 10: rank = "10";
				break;
				case 11: rank = "Jack";
				break;
				case 12: rank = "Queen";
				break;
				case 13: rank = "King";
				break;
		}
		return   rank+ " of" + suit;
	}
	
	public static int deal(){
	Random rand = new Random();
	
	return rand.nextInt(13)+1;
	
		
}
public static int value(int x){
	if(x>10)
		return 10;
	else return x;
}
}
