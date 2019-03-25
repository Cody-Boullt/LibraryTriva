/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
 */

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class GameOver extends JFrame {

	private JFrame frmGameOver;
	private final JLabel lblGameOver = new JLabel("Game Over!");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOver window = new GameOver();
					window.frmGameOver.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameOver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameOver = new JFrame();
		frmGameOver.setTitle("Game Over");
		frmGameOver.setBounds(100, 100, 450, 300);
		frmGameOver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameOver.getContentPane().setLayout(null);
		lblGameOver.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblGameOver.setBounds(131, 50, 143, 32);
		frmGameOver.getContentPane().add(lblGameOver);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frmGameOver.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Main Menu");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Launcher.main(null);
				frmGameOver.dispose();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Quit");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGameOver.dispose();
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
				howTo.setSize( 364, 161 );
				howTo.setVisible(true);
			}
		});
		menu_1.add(menuItem_2);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblScore.setBounds(131, 128, 66, 31);
		frmGameOver.getContentPane().add(lblScore);
		
		JLabel lblHighScore = new JLabel("High Score:");
		lblHighScore.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblHighScore.setBounds(131, 162, 114, 31);
		frmGameOver.getContentPane().add(lblHighScore);
		
		JButton buttonQuit = new JButton("Quit");
		buttonQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonQuit.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		buttonQuit.setBounds(232, 212, 134, 28);
		frmGameOver.getContentPane().add(buttonQuit);
		
		JButton buttonPlayAgain = new JButton("Play Again");
		buttonPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonPlayAgain.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		buttonPlayAgain.setBounds(67, 212, 135, 28);
		frmGameOver.getContentPane().add(buttonPlayAgain);
		
		JLabel lblScoreCounter = new JLabel("X");
		lblScoreCounter.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblScoreCounter.setBounds(197, 128, 66, 31);
		frmGameOver.getContentPane().add(lblScoreCounter);
		
		JLabel lblHighScoreCounter = new JLabel("X");
		lblHighScoreCounter.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblHighScoreCounter.setBounds(243, 162, 66, 31);
		frmGameOver.getContentPane().add(lblHighScoreCounter);
	}

}
