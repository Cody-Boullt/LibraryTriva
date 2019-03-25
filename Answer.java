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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")


public class Answer extends JFrame {

	private JFrame frmAnswer;
	int strike = 0;
	int score = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String grade, String topic, String questPass, String choice) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Answer window = new Answer(grade, topic, questPass, choice);
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
	public Answer(String grade, String topic, String questPass, String choice) {
		initialize(grade, topic, questPass, choice);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String grade, String topic, String questPass, String choice) {
		frmAnswer = new JFrame();
		frmAnswer.setTitle("Results");
		frmAnswer.setBounds(200, 200, 450, 300);
		frmAnswer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAnswer.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Main Menu");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Launcher.main(null);
				frmAnswer.dispose();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Quit");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAnswer.dispose();
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
		frmAnswer.getContentPane().setLayout(null);
		
		if(choice == questPass){
			
			JLabel lblCorrect = new JLabel("Correct!");
			lblCorrect.setBounds(131, 29, 165, 31);
			frmAnswer.getContentPane().add(lblCorrect);
			lblCorrect.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
			
			score = score + 1;
		}
		else {
			
			JLabel lblIncorrect = new JLabel("Incorrect!");
			lblIncorrect.setBounds(131, 29, 165, 31);
			frmAnswer.getContentPane().add(lblIncorrect);
			lblIncorrect.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
			
			strike = strike + 1;
		}
		
		JLabel labelScore = new JLabel("Score:");
		labelScore.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		labelScore.setBounds(131, 107, 63, 31);
		frmAnswer.getContentPane().add(labelScore);
		
		JLabel lblStrikes = new JLabel("Strikes:");
		lblStrikes.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblStrikes.setBounds(131, 141, 75, 31);
		frmAnswer.getContentPane().add(lblStrikes);
		
		JButton buttonContinue = new JButton("Continue");
		buttonContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopicSelect topic = new TopicSelect(grade);
				topic.setLocation( 200, 200 );
				topic.setSize( 450, 300 );
				topic.setVisible(true);
				frmAnswer.dispose();
				dispose();
			}
		});

		
		JLabel lblScoreCounter = new JLabel(Integer.toString(score));
		lblScoreCounter.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblScoreCounter.setBounds(197, 107, 112, 31);
		frmAnswer.getContentPane().add(lblScoreCounter);
		
		JLabel lblStrikeCounter = new JLabel(Integer.toString(strike));
		lblStrikeCounter.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
		lblStrikeCounter.setBounds(207, 141, 103, 31);
		frmAnswer.getContentPane().add(lblStrikeCounter);
		buttonContinue.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		buttonContinue.setBounds(141, 191, 134, 28);
		frmAnswer.getContentPane().add(buttonContinue);
	}
}
