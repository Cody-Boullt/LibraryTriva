/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
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

	private JFrame frmLibraryTriviaCenter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.frmLibraryTriviaCenter.setVisible(true);
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
		QuestionArray.fillArray();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryTriviaCenter = new JFrame();
		frmLibraryTriviaCenter.setTitle("Main Menu");
		frmLibraryTriviaCenter.setBounds(200, 200, 450, 300);
		frmLibraryTriviaCenter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryTriviaCenter.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Library Trivia Center!");
		lblNewLabel.setBounds(10, 11, 414, 24);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmLibraryTriviaCenter.getContentPane().add(lblNewLabel);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setFont(new Font("Eras Bold ITC", Font.PLAIN, 11));
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Difficulty difficulty = new Difficulty();
				difficulty.setLocation( 200, 200 );
				difficulty.setSize( 450, 300 );
				difficulty.setVisible(true);
				frmLibraryTriviaCenter.dispose();
			}
		});
		btnNewGame.setBounds(169, 84, 95, 23);
		frmLibraryTriviaCenter.getContentPane().add(btnNewGame);
		
		JButton btnHowToPlay = new JButton("How To Play");
		btnHowToPlay.setFont(new Font("Eras Bold ITC", Font.PLAIN, 11));
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay howTo = new HowToPlay();
				howTo.setLocation( 250, 150 );
				howTo.setSize( 364, 161 );
				howTo.setVisible(true);
			}
		});
		btnHowToPlay.setBounds(162, 119, 110, 23);
		frmLibraryTriviaCenter.getContentPane().add(btnHowToPlay);
		
		JButton btnQuitGame = new JButton("Quit Game");
		btnQuitGame.setFont(new Font("Eras Bold ITC", Font.PLAIN, 11));
		btnQuitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLibraryTriviaCenter.dispose();
			}
		});
		btnQuitGame.setBounds(169, 154, 95, 23);
		frmLibraryTriviaCenter.getContentPane().add(btnQuitGame);
	}

}
