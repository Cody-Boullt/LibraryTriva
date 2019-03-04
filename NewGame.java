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
public class NewGame extends JFrame
{
	private JButton buttonOne;
		 
	public NewGame()
	{
		super("New Game");
		setLayout(new FlowLayout());
			 
		buttonOne = new JButton("Help Page");
		add(buttonOne);

		buttonOne.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				HelpPage helpPage = new HelpPage();
				helpPage.setSize( 400, 400 );
				helpPage.setVisible(true);
				dispose();
			}
		} );
	} // end NewGame
	
	public static void main( String[] args )
	{
		NewGame application = new NewGame();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.setSize( 300, 300 );
		application.setVisible( true );
		 
	} // end main
	
} // end NewGame
