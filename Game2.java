import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Game2 {
	
	public static void main(String[] args){
		
	}

	public void play(){	
		Player P1 = new Player();	
		Cards2 deck= new Cards2();
	 int pcard1=deck.deal();
	 int vpcard1 = deck.value(pcard1);
	 int pcard2=deck.deal();
	 int vpcard2 = deck.value(pcard2);
	 int ptotal;
 	 ptotal = vpcard1+vpcard2;
	 String q="";
	 int dcard1=deck.deal();
	 int vdcard1 = deck.value(dcard1);
	 int dcard2=deck.deal();
	 int vdcard2 =deck. value(dcard2);
	 int dtotal;
	 dtotal= vdcard1+vdcard2;
	 
	JOptionPane.showMessageDialog(null,deck.toString(pcard1));
	JOptionPane.showMessageDialog(null,deck.toString(pcard2));
	JOptionPane.showMessageDialog(null,"Your total is " + ptotal);
	


	while(!q.equals("n")){
		q = JOptionPane.showInputDialog("Do you want another card(y-n): ");
		
		if(q.equalsIgnoreCase("y")){
			
	        //JOptionPane.showMessageDialog(null,deck.toString(deck.value(deck.deal())));
			ptotal += deck.value(deck.deal());
			JOptionPane.showMessageDialog(null,"Your total now is " + ptotal);}
			
	if(ptotal==21){
		JOptionPane.showMessageDialog(null,"BlackJack you win");		
		//P1.wonG();
	}
		if(ptotal>21){
		JOptionPane.showMessageDialog(null,"You busted");
	}

	}
	JOptionPane.showMessageDialog(null,"dealers GO");
	JOptionPane.showMessageDialog(null,deck.toString(dcard1));
	JOptionPane.showMessageDialog(null,deck.toString(dcard2));
	JOptionPane.showMessageDialog(null,"Dealers total is " + dtotal);
	
	//dealer
	while(dtotal <18){
		
		dtotal+=deck.value(deck.deal());
		JOptionPane.showMessageDialog(null,"Dealers total is " + dtotal);
	
	
	if(dtotal == 21){
		JOptionPane.showMessageDialog(null,"Dealer wins");
		}
	if(dtotal >21){
		JOptionPane.showMessageDialog(null,"Dealer Bust");
		}
	}	
/*		
	if(ptotal < dtotal){
		JOptionPane.showMessageDialog(null,"Dealer win");
		}
	else if (ptotal == dtotal){
		JOptionPane.showMessageDialog(null,"You tied");
		
		}
	else if(ptotal > dtotal) {
		JOptionPane.showMessageDialog(null,"You win");}*/
		
}


}
