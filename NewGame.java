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
	private JButton helpButton;
	private JButton quitButton;
	private JButton engButton;
	private JButton mathButton;
	private JButton sciButton;
	private JButton histButton;
		 
	public NewGame()
	{
		super("New Game");
		setLayout(new FlowLayout());
			 
		helpButton = new JButton("Help Page");
		add(helpButton);
		quitButton = new JButton("Quit Game");
		add(quitButton);
		engButton = new JButton("English");
		add(engButton);
		mathButton = new JButton("Math");
		add(mathButton);
		sciButton = new JButton("Science");
		add(sciButton);
		histButton = new JButton("History");
		add(histButton);

		helpButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				HelpPage helpPage = new HelpPage();
				helpPage.setSize( 400, 400 );
				helpPage.setVisible(true);
				dispose();
			}
		} );
		
		quitButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
			
		} );
		
		engButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				HelpPage helpPage = new HelpPage();
				helpPage.setSize( 400, 400 );
				helpPage.setVisible(true);
				dispose();
			}
		} );
		
		mathButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				HelpPage helpPage = new HelpPage();
				helpPage.setSize( 400, 400 );
				helpPage.setVisible(true);
				dispose();
			}
		} );
		
		sciButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				HelpPage helpPage = new HelpPage();
				helpPage.setSize( 400, 400 );
				helpPage.setVisible(true);
				dispose();
			}
		} );
		
		histButton.addActionListener(new ActionListener ()
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
