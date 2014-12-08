import java.io.*;
import java.awt.*;
import javax.swing.*;
/** This is the instantiable player class
 *@author Emmet Diviney
 *@version 1*/
 
public class Player2 implements Serializable {//saves the file
	//attributes
	private int win=0;
	 private int loss=0; 
	private String name;

	/**Mutator method to set the players name
	 *@param name sets the player name*/
	public void setName(String name){
		this.name=name;
	}
	/**Accessor method to return hte name
	 *@return the player name*/
	public String getName(){return name;
	}
	/**Mutator method to set the wins
	 *@param win */
	public void setWin(int win) {
		this.win=win;
	}
	/**Mutator method to set the losses
	 *@param loss*/
	public void setLosses(int loss){
		this.loss=loss;
	}
	/**Accessor method to get the wins
	 *@param win*/
	public int getWin(){return win;
	}
	/**Accessor method use the get the losses
	 *@param loss*/
	public int getLosses(){return loss;
	}
	/**Method use to count hte wins
	 *@param win */
	public void wonG(int wins) {
		wins++;
		win+=wins;
	}
	/**Method used the count the losses
	 *@param loss*/
	public void lossG(int losses) {
		losses++;
		loss += losses;
	}
	/**toString method to return the player details
	 *@return the name nad wins and losses as a String*/
	public String toString(){
		return name + "\n " + win + " " + loss ;
	}
}//end of class