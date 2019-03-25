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
		lblGameOver.setFont(new Font("Arial", Font.BOLD, 18));
		lblGameOver.setBounds(145, 46, 143, 48);
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
				howTo.setSize( 450, 300 );
				howTo.setVisible(true);
			}
		});
		menu_1.add(menuItem_2);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setFont(new Font("Arial", Font.BOLD, 18));
		lblScore.setBounds(145, 117, 143, 48);
		frmGameOver.getContentPane().add(lblScore);
		
		JLabel lblHighScore = new JLabel("High Score:");
		lblHighScore.setFont(new Font("Arial", Font.BOLD, 18));
		lblHighScore.setBounds(145, 148, 143, 48);
		frmGameOver.getContentPane().add(lblHighScore);
	}

}
