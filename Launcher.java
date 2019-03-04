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
	 private JButton newButton;
	 private JButton helpButton;
	 private JButton quitButon;

	 public Launcher()
	 {
		 super("Launcher");
		 setLayout(new FlowLayout());

		 newButton = new JButton("New Game");
		 add(newButton);
		 helpButton = new JButton("Help Page");
		 add(helpButton);
		 quitButon = new JButton("Quit Game");
		 add(quitButon);

		 newButton.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 NewGame newGame = new NewGame();
				 newGame.setSize( 400, 400 ); 
				 newGame.setVisible(true);  
				 dispose();
			 }
		 } );

		 helpButton.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 HelpPage helpPage = new HelpPage();
				 helpPage.setSize( 400, 400 );
				 helpPage.setVisible(true);
				 dispose();
			 }
		 } );

		 quitButon.addActionListener(new ActionListener ()
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
