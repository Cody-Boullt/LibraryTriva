/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/04/2019
 */

import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Difficulty extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Difficulty window = new Difficulty();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Difficulty() {
		setTitle("Difficulty Selection");
		getContentPane().setLayout(null);
		
		JLabel lblDifficulty = new JLabel("What grade are you in?");
		lblDifficulty.setFont(new Font("Arial", Font.BOLD, 12));
		lblDifficulty.setBounds(143, 55, 147, 24);
		getContentPane().add(lblDifficulty);
		
		JButton btnEasy = new JButton("1st Grade");
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TopicSelect topic = new TopicSelect();
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnEasy.setFont(new Font("Arial", Font.BOLD, 12));
		btnEasy.setBounds(234, 90, 108, 39);
		getContentPane().add(btnEasy);
		
		JButton btnMedium = new JButton("Kindergarten");
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopicSelect topic = new TopicSelect();
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnMedium.setFont(new Font("Arial", Font.BOLD, 12));
		btnMedium.setBounds(92, 90, 108, 39);
		getContentPane().add(btnMedium);
		
		JButton btnHard = new JButton("2nd Grade");
		btnHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopicSelect topic = new TopicSelect();
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnHard.setFont(new Font("Arial", Font.BOLD, 12));
		btnHard.setBounds(92, 141, 108, 38);
		getContentPane().add(btnHard);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 23);
		getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmMainMenu = new JMenuItem("Main Menu");
		mntmMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Launcher.main(null);
				dispose();
			}
		});
		mnFile.add(mntmMainMenu);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnFile.add(mntmQuit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHowToPlay = new JMenuItem("How to Play");
		mntmHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay howTo = new HowToPlay();
				howTo.setLocation( 250, 150 );
				howTo.setSize( 450, 300 );
				howTo.setVisible(true);
			}
		});
		mnHelp.add(mntmHowToPlay);
		
		JButton btnrdGrade = new JButton("3rd Grade");
		btnrdGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopicSelect topic = new TopicSelect();
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnrdGrade.setFont(new Font("Arial", Font.BOLD, 12));
		btnrdGrade.setBounds(234, 142, 108, 39);
		getContentPane().add(btnrdGrade);
		
		JButton btnthGrade = new JButton("4th Grade");
		btnthGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopicSelect topic = new TopicSelect();
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnthGrade.setFont(new Font("Arial", Font.BOLD, 12));
		btnthGrade.setBounds(92, 191, 108, 39);
		getContentPane().add(btnthGrade);
		
		JButton btnthGrade_1 = new JButton("5th Grade");
		btnthGrade_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopicSelect topic = new TopicSelect();
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnthGrade_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnthGrade_1.setBounds(234, 192, 108, 39);
		getContentPane().add(btnthGrade_1);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
