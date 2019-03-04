/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/04/2019
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Launcher extends JFrame 
{
	 private JButton buttonOne;
	 private JButton buttonTwo;
	 private JButton buttonThree;
	
	 // constructor sets up GUI
	   public Launcher()
	   {
		   
		   //window title and frame layout
		   super("Launcher");
		   setLayout(new FlowLayout());
		   
		   //button and text		   
		   buttonOne = new JButton("New Game");
		   add(buttonOne); //add button to frame
		   buttonTwo = new JButton("Help Page");
		   add(buttonTwo);  //add button to frame
		   buttonThree = new JButton("Quit Game");
		   add(buttonThree);  //add button to frame
		  
		   //button handler 
		   buttonOne.addActionListener(new ActionListener () {
			   public void actionPerformed(ActionEvent e) {
				 NewGame newGame = new NewGame();
				 newGame.setSize( 400, 400 ); 
				 newGame.setVisible(true);  
				 dispose();
			   }
		   });
		 //button handler 
		   buttonTwo.addActionListener(new ActionListener(){
			   
			   public void actionPerformed(ActionEvent e){
				   
				   HelpPage helpPage = new HelpPage();
				   helpPage.setSize( 400, 400 ); 
				   helpPage.setVisible(true);  
				   dispose();
				   
			   }
		   });
		 //button handler 
		   buttonThree.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent e)
				{
					dispose();
				}
				
			} );
		   
	     }
	   
    //main program
	public static void main(String[] args) {
		  Launcher application = new Launcher(); // create a new frame
	      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      application.setSize( 300, 300 ); // set the size
	      application.setVisible( true ); // show the frame
	      
		} // end main	
	
}
