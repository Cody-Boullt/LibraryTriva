/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/04/2019
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		JLabel lblInstructionsHere = new JLabel("Instructions here");
		lblInstructionsHere.setBounds(167, 44, 99, 30);
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
