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
public class HelpPage extends JFrame
{
	private JButton quitButton;
		 
	public HelpPage()
	{
		super("Help Page");
		setLayout(new FlowLayout());

		quitButton = new JButton("CLOSE WINDOW");
		add(quitButton);

		quitButton.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
			
		} );
	}
	
	public static void main( String[] args )
	{
		HelpPage application = new HelpPage();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.setSize( 300, 300 );
		application.setVisible( true );
		 
	} // end main
	
} // end HelpPage
