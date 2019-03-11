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
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Question extends JFrame {

	private JFrame frmQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question window = new Question();
					window.frmQuestion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Question() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuestion = new JFrame();
		frmQuestion.setTitle("Trivia");
		frmQuestion.setBounds(100, 100, 450, 300);
		frmQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuestion.getContentPane().setLayout(null);
		
		JLabel lblQuestionHere = new JLabel("Question here");
		lblQuestionHere.setFont(new Font("Arial", Font.BOLD, 12));
		lblQuestionHere.setBounds(171, 42, 91, 27);
		frmQuestion.getContentPane().add(lblQuestionHere);
		
		JButton btnAnswer = new JButton("Answer 1");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnswer.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer.setBounds(53, 80, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer);
		
		JButton btnAnswer_1 = new JButton("Answer 2");
		btnAnswer_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer_1.setBounds(233, 80, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer_1);
		
		JButton btnAnswer_2 = new JButton("Answer 3");
		btnAnswer_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer_2.setBounds(53, 175, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer_2);
		
		JButton btnAnswer_3 = new JButton("Answer 4");
		btnAnswer_3.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer_3.setBounds(233, 175, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 23);
		frmQuestion.getContentPane().add(menuBar);
		
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
	}
}
