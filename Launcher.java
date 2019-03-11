/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/04/2019
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Launcher extends JFrame{

	private JFrame frmLibraryTrivaCenter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.frmLibraryTrivaCenter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryTrivaCenter = new JFrame();
		frmLibraryTrivaCenter.setTitle("Main Menu");
		frmLibraryTrivaCenter.setBounds(200, 200, 450, 300);
		frmLibraryTrivaCenter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryTrivaCenter.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Library Trivia Center!");
		lblNewLabel.setBounds(53, 5, 328, 24);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmLibraryTrivaCenter.getContentPane().add(lblNewLabel);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Difficulty difficulty = new Difficulty();
				difficulty.setLocation( 200, 200 );
				difficulty.setSize( 450, 300 );
				difficulty.setVisible(true);
				frmLibraryTrivaCenter.dispose();
			}
		});
		btnNewGame.setBounds(169, 84, 95, 23);
		frmLibraryTrivaCenter.getContentPane().add(btnNewGame);
		
		JButton btnHowToPlay = new JButton("How To Play");
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay howTo = new HowToPlay();
				howTo.setLocation( 250, 150 );
				howTo.setSize( 450, 300 );
				howTo.setVisible(true);
			}
		});
		btnHowToPlay.setBounds(162, 119, 110, 23);
		frmLibraryTrivaCenter.getContentPane().add(btnHowToPlay);
		
		JButton btnQuitGame = new JButton("Quit Game");
		btnQuitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLibraryTrivaCenter.dispose();
			}
		});
		btnQuitGame.setBounds(169, 154, 95, 23);
		frmLibraryTrivaCenter.getContentPane().add(btnQuitGame);
	}

}
