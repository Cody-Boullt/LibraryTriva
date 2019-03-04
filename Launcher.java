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

	 public Launcher()
	 {
		 super("Launcher");
		 setLayout(new FlowLayout());

		 buttonOne = new JButton("New Game");
		 add(buttonOne);
		 buttonTwo = new JButton("Help Page");
		 add(buttonTwo);
		 buttonThree = new JButton("Quit Game");
		 add(buttonThree);

		 buttonOne.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 NewGame newGame = new NewGame();
				 newGame.setSize( 400, 400 ); 
				 newGame.setVisible(true);  
				 dispose();
			 }
		 } );

		 buttonTwo.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 HelpPage helpPage = new HelpPage();
				 helpPage.setSize( 400, 400 );
				 helpPage.setVisible(true);
				 dispose();
			 }
		 } );

		 buttonThree.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 dispose();
			 }
		 } );
	 } // end Launcher

	 public static void main(String[] args)
	 {
		 Launcher application = new Launcher();
	     application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	     application.setSize( 300, 300 );
	     application.setVisible( true );
	     
	 } // end main	

} // end class Launcher
