import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class MyMenu extends JFrame implements ActionListener {
JMenu fileMenu;
JMenu PlayerMenu;
LinkedList<Player> player; //need for the set of players
JButton push;

public static void main(String[] args){
	MyMenu frame = new MyMenu();	
	frame.setVisible(true);
	Game2 g2 = new Game2();
}
public MyMenu() {
	setTitle("BlackJack Menu");
	Container cPane = new Container();
	setSize(600,600);
	setLayout(new FlowLayout());
	setLocation(300,250);
	getContentPane().setBackground(Color.orange);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	push=new JButton("Push Me");
	cPane.add(push);
	createFileMenu();
	createPlayerMenu();
	
	JMenuBar mb = new JMenuBar();// creates the menu bar
	setJMenuBar(mb);
	mb.setBackground(Color.green);
	mb.add(fileMenu);// added to menu
	mb.add(PlayerMenu);//added to menu
}
private void createFileMenu() {
	JMenuItem item; //creates a menu item
	tryOut();
	fileMenu = new JMenu("File");// creating menu item underneath the file
	item = new JMenuItem("New Game");
	item.addActionListener(this);// hte action listener listens for when it is clicked on
	fileMenu.add(item);//adds the item to the file menubar
	item.setBackground(Color.white);// setting the color to white
	item = new JMenuItem("Open");// creates the item open
	item.addActionListener(this);// listens for it to be clicked
	fileMenu.add(item);
	item.setBackground(Color.white);
	
	item = new JMenuItem("Save");// add a save 
	item.setBackground(Color.white);
	item.addActionListener(this);
	fileMenu.add(item);
	fileMenu.addSeparator();// adds a separator which adds a line to separate the save and the quit items
	item = new JMenuItem("Quit");
	item.setBackground(Color.white);
	item.addActionListener(this);
	fileMenu.add(item);
}

public void tryOut(){
	player = new LinkedList<Player>();// creates a linked list from the player class
}
public void saveF() throws IOException{ 
 	
	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("player.dat"));//the 
	os.writeObject(player);
		os.close();
 }
 public void openF(){
 	try{
 		ObjectInput is;
 		is = new ObjectInputStream(new FileInputStream("player.dat"));
 		player =(LinkedList<Player>) is. readObject();
 		is.close();
 	}
 	catch(Exception e){
 		JOptionPane.showMessageDialog(null,"open didn't work");
 	}
 }
 public void add(){
 	Player plays = new Player();
 	plays.setName(JOptionPane.showInputDialog("Add your Name"));
 	player.add(plays); 	 
 }
 public void displayer(){
 	JTextArea area = new JTextArea();
 	area.append(player.toString());
 	JOptionPane.showMessageDialog(null,area);
 }
private void createPlayerMenu() {
	JMenuItem item;
	
	PlayerMenu = new JMenu("Player");
	
	item= new JMenuItem("Add Player");
	item.addActionListener(this);
	item.setBackground(Color.white);
	PlayerMenu.add(item);
	
	PlayerMenu.addSeparator();
	item = new JMenuItem("Display Game Details");
	item.setBackground(Color.white);
	item.addActionListener(this);
	PlayerMenu.add(item);
}

public void actionPerformed(ActionEvent e){
	if(e.getActionCommand().equals("Quit")) {
		JOptionPane.showMessageDialog(null,"Your are you quitting");
		System.exit(0);
	}
	else if(e.getActionCommand().equals("New Game")) {
		JOptionPane.showMessageDialog(null,"The game is now Starting");
		Game2 g2 = new Game2();
		g2.play();
	}
	 else if(e.getActionCommand().equals("Open")) {
		openF();
		displayer();
	}
	else if(e.getActionCommand().equals("Add Player")) {
		add();
		}
		
	else if(e.getActionCommand().equals("Display Game Details")) {
		displayer();
	}
	else if(e.getActionCommand().equals("Save")) {
		try{
		saveF();
		JTextArea area = new JTextArea();
		area.setText("Save Title");
		area.append("\nYou have saved the file");
		JOptionPane.showMessageDialog(null,area);
		}
		catch(IOException s){
			
		}
	}
}
/***************************************************************************************
*    Title: <BicycleFrame4>
*    Author: <John Walsh>
*    Date: <2014>
*    Code version: <code version>
*    Availability: <x-drive in mydocs, it tralee>
*
***************************************************************************************/
}
 
