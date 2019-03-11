/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/04/2019
 */

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Answer extends JFrame {

	private JFrame frmAnswer;
	private final JLabel lblCorrectincorrect = new JLabel("Correct/Incorrect");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Answer window = new Answer();
					window.frmAnswer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Answer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnswer = new JFrame();
		frmAnswer.setTitle("Results");
		frmAnswer.setBounds(100, 100, 450, 300);
		frmAnswer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAnswer.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Main Menu");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Launcher.main(null);
				dispose();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Quit");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("Help");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("How to Play");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay howTo = new HowToPlay();
				howTo.setLocation( 250, 150 );
				howTo.setSize( 450, 300 );
				howTo.setVisible(true);
			}
		});
		menu_1.add(menuItem_2);
		frmAnswer.getContentPane().setLayout(null);
		lblCorrectincorrect.setBounds(143, 58, 148, 31);
		frmAnswer.getContentPane().add(lblCorrectincorrect);
		lblCorrectincorrect.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel label = new JLabel("Score:");
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setBounds(143, 112, 143, 48);
		frmAnswer.getContentPane().add(label);
		
		JLabel lblStrikes = new JLabel("Strikes:");
		lblStrikes.setFont(new Font("Arial", Font.BOLD, 18));
		lblStrikes.setBounds(143, 145, 143, 48);
		frmAnswer.getContentPane().add(lblStrikes);
	}

}
