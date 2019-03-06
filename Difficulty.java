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
public class Difficulty extends JFrame
{
	private JButton easyButton;
	private JButton mediumButton;
	private JButton hardButton;
		 
	public Difficulty()
	{
		super("Difficulty");
		setLayout(new FlowLayout());
			 
		easyButton = new JButton("Easy");
		add(easyButton);
		mediumButton = new JButton("Medium");
		add(mediumButton);
		hardButton = new JButton("Hard");
		add(hardButton);

		easyButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				NewGame newGame = new NewGame();
				newGame.setSize( 400, 400 );
				newGame.setVisible(true);
				dispose();
			}
		} );
		
		mediumButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				NewGame newGame = new NewGame();
				newGame.setSize( 400, 400 );
				newGame.setVisible(true);
				dispose();
			}
		} );
		
		hardButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				NewGame newGame = new NewGame();
				newGame.setSize( 400, 400 );
				newGame.setVisible(true);
				dispose();
			}
		} );
		
	} // end NewGame
	
	public static void main( String[] args )
	{
		Difficulty application = new Difficulty();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.setSize( 300, 300 );
		application.setVisible( true );
		 
	} // end main
	
} // end NewGame
