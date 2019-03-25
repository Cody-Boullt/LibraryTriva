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
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Question extends JFrame {

	private JFrame frmQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String grade, String topic) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question window = new Question(grade, topic);
					window.frmQuestion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param topic 
	 * @param grade 
	 * @param questions 
	 */
	public Question(String grade, String topic) {
		initialize(grade, topic);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param topic 
	 * @param grade 
	 */
	private void initialize(String grade, String topic) {
		String questPassed = QuestionArray.getQuestArray(grade, topic);
		
		frmQuestion = new JFrame();
		frmQuestion.setTitle("Trivia");
		frmQuestion.setBounds(200, 200, 450, 300);
		frmQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuestion.getContentPane().setLayout(null);
		
		JLabel lblQuestionHere = new JLabel(questPassed, SwingConstants.CENTER);
		lblQuestionHere.setFont(new Font("Arial", Font.BOLD, 12));
		lblQuestionHere.setBounds(10, 42, 412, 27);
		frmQuestion.getContentPane().add(lblQuestionHere);
		
		JButton btnAnswer = new JButton("Answer 1");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.main(null);
				frmQuestion.dispose();
			}
		});
		btnAnswer.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer.setBounds(53, 80, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer);
		
		JButton btnAnswer_1 = new JButton("Answer 2");
		btnAnswer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Answer.main(null);
				frmQuestion.dispose();
			}
		});
		btnAnswer_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer_1.setBounds(233, 80, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer_1);
		
		JButton btnAnswer_2 = new JButton("Answer 3");
		btnAnswer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.main(null);
				frmQuestion.dispose();
			}
		});
		btnAnswer_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnswer_2.setBounds(53, 175, 147, 75);
		frmQuestion.getContentPane().add(btnAnswer_2);
		
		JButton btnAnswer_3 = new JButton("Answer 4");
		btnAnswer_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.main(null);
				frmQuestion.dispose();
			}
		});
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
				frmQuestion.dispose();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Quit");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuestion.dispose();
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
