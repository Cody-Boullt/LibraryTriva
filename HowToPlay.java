/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/04/2019
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class HowToPlay extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToPlay window = new HowToPlay();
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
	public HowToPlay() {
		setTitle("How to Play");
		getContentPane().setLayout(null);
		
		JLabel lblInstructionsHere = new JLabel("<html><body><center>Use your mouse or keyboard to select your grade level and the subject you want to play. <br><br>Questions are multiple choice and with each correct answer you build up a score. Three incorrect answers and game over!</center></body></html>");
		lblInstructionsHere.setHorizontalAlignment(SwingConstants.LEFT);
		lblInstructionsHere.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		lblInstructionsHere.setBounds(10, 11, 329, 101);
		getContentPane().add(lblInstructionsHere);
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
