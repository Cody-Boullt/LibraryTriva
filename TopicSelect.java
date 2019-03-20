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
public class TopicSelect extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public TopicSelect() {
		setTitle("Topic Selection");
		getContentPane().setLayout(null);
		
		JLabel lblLibraryCenter = new JLabel("Library Center");
		lblLibraryCenter.setFont(new Font("Arial", Font.BOLD, 12));
		lblLibraryCenter.setBounds(175, 44, 84, 16);
		getContentPane().add(lblLibraryCenter);
		
		JLabel lblChooseATopic = new JLabel("Choose a topic:");
		lblChooseATopic.setFont(new Font("Arial", Font.BOLD, 12));
		lblChooseATopic.setBounds(168, 67, 91, 27);
		getContentPane().add(lblChooseATopic);
		
		JButton btnEnglish = new JButton("English");
		btnEnglish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question english = new Question();
				english.setLocation( 200, 200 );
				english.setSize( 450, 300 );
				english.setVisible(true);
				dispose();
			}
		});
		btnEnglish.setFont(new Font("Arial", Font.BOLD, 12));
		btnEnglish.setBounds(79, 105, 108, 39);
		getContentPane().add(btnEnglish);
		
		JButton btnMath = new JButton("Math");
		btnMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question math = new Question();
				math.setLocation( 200, 200 );
				math.setSize( 450, 300 );
				math.setVisible(true);
				dispose();
			}
		});
		btnMath.setFont(new Font("Arial", Font.BOLD, 12));
		btnMath.setBounds(79, 180, 108, 39);
		getContentPane().add(btnMath);
		
		JButton btnScience = new JButton("Science");
		btnScience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question science = new Question();
				science.setLocation( 200, 200 );
				science.setSize( 450, 300 );
				science.setVisible(true);
				dispose();
			}
		});
		btnScience.setFont(new Font("Arial", Font.BOLD, 12));
		btnScience.setBounds(244, 105, 108, 39);
		getContentPane().add(btnScience);
		
		JButton btnHistory = new JButton("History");
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question history = new Question();
				history.setLocation( 200, 200 );
				history.setSize( 450, 300 );
				history.setVisible(true);
				dispose();
			}
		});
		btnHistory.setFont(new Font("Arial", Font.BOLD, 12));
		btnHistory.setBounds(244, 180, 108, 39);
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
				howTo.setSize( 450, 300 );
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
