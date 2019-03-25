/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
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
		lblDifficulty.setFont(new Font("Eras Bold ITC", Font.PLAIN, 14));
		lblDifficulty.setBounds(24, 54, 221, 24);
		getContentPane().add(lblDifficulty);
		
		JButton btnOne = new JButton("1st Grade");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grade = "1";
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnOne.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		btnOne.setBounds(247, 90, 119, 39);
		getContentPane().add(btnOne);
		
		JButton btnKin = new JButton("Kindergarten");
		btnKin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = "K";
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnKin.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		btnKin.setBounds(94, 90, 119, 39);
		getContentPane().add(btnKin);
		
		JButton btnTwo = new JButton("2nd Grade");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = "2";
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnTwo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 11));
		btnTwo.setBounds(94, 141, 119, 38);
		getContentPane().add(btnTwo);
		
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
				howTo.setSize( 364, 161 );
				howTo.setVisible(true);
			}
		});
		mnHelp.add(mntmHowToPlay);
		
		JButton btnThree = new JButton("3rd Grade");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = "3";
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnThree.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		btnThree.setBounds(247, 142, 119, 39);
		getContentPane().add(btnThree);
		
		JButton btnFour = new JButton("4th Grade");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = "4";
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnFour.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		btnFour.setBounds(94, 191, 119, 39);
		getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5th Grade");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = "5";
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				dispose();
			}
		});
		btnFive.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		btnFive.setBounds(247, 192, 119, 39);
		getContentPane().add(btnFive);
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
