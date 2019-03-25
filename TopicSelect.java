/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
 */

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
public class TopicSelect extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TopicSelect window = new TopicSelect();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 * @param grade 
	 */
	public TopicSelect(String grade) {
		setTitle("Topic Selection");
		getContentPane().setLayout(null);
		
		JLabel lblLibraryCenter = new JLabel("Library Center");
		lblLibraryCenter.setFont(new Font("Eras Bold ITC", Font.PLAIN, 14));
		lblLibraryCenter.setBounds(156, 34, 103, 26);
		getContentPane().add(lblLibraryCenter);
		
		JLabel lblChooseATopic = new JLabel("Choose a topic:");
		lblChooseATopic.setFont(new Font("Eras Bold ITC", Font.PLAIN, 14));
		lblChooseATopic.setBounds(156, 67, 113, 27);
		getContentPane().add(lblChooseATopic);
		
		JButton btnEnglish = new JButton("Math");
		btnEnglish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String topic = "math";
				Question.main(grade, topic);
				dispose();
			}
		});
		btnEnglish.setFont(new Font("Arial", Font.BOLD, 12));
		btnEnglish.setBounds(67, 105, 90, 28);
		getContentPane().add(btnEnglish);
		
		JButton btnMath = new JButton("Science");
		btnMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String topic = "science";
				Question.main(grade, topic);
				dispose();
			}
		});
		btnMath.setFont(new Font("Arial", Font.BOLD, 12));
		btnMath.setBounds(67, 191, 90, 28);
		getContentPane().add(btnMath);
		
		JButton btnScience = new JButton("History");
		btnScience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String topic = "history";
				Question.main(grade, topic);
				dispose();
			}
		});
		btnScience.setFont(new Font("Arial", Font.BOLD, 12));
		btnScience.setBounds(273, 105, 90, 28);
		getContentPane().add(btnScience);
		
		JButton btnHistory = new JButton("English");
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String topic = "english";
				Question.main(grade, topic);
				dispose();
			}
		});
		btnHistory.setFont(new Font("Arial", Font.BOLD, 12));
		btnHistory.setBounds(273, 191, 90, 28);
		getContentPane().add(btnHistory);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 23);
		getContentPane().add(menuBar);
		
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
				howTo.setSize( 364, 161 );
				howTo.setVisible(true);
			}
		});
		menu_1.add(menuItem_2);
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
