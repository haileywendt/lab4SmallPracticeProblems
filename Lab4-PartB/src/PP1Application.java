import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PP1Application {

	private JFrame frame;
	private JTextField yearField;
	PracticeProblem1 temp = new PracticeProblem1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PP1Application window = new PP1Application();
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
	public PP1Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel monthLabelDisplay = new JLabel("Month");
		monthLabelDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		monthLabelDisplay.setFont(new Font("Arial Black", Font.BOLD, 16));
		monthLabelDisplay.setBounds(155, 88, 158, 38);
		frame.getContentPane().add(monthLabelDisplay);
		
		JLabel dayLabelDisplay = new JLabel("0");
		dayLabelDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabelDisplay.setFont(new Font("Arial Black", Font.BOLD, 16));
		dayLabelDisplay.setBounds(155, 136, 158, 38);
		frame.getContentPane().add(dayLabelDisplay);
		
		JLabel errorMessage = new JLabel("");
		errorMessage.setFont(new Font("Arial Black", Font.BOLD, 16));
		errorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		errorMessage.setBounds(20, 198, 293, 31);
		frame.getContentPane().add(errorMessage);
		
		JLabel yearLabel = new JLabel("Enter year:");
		yearLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		yearLabel.setHorizontalAlignment(SwingConstants.CENTER);
		yearLabel.setBounds(10, 39, 135, 38);
		frame.getContentPane().add(yearLabel);
		
		yearField = new JTextField();
		yearField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int userInput = Integer.parseInt(yearField.getText());
					temp.setYear(userInput);
					monthLabelDisplay.setText(String.valueOf(temp.getMonth()));
					dayLabelDisplay.setText(String.valueOf(temp.getDay()));
				}
				catch(NumberFormatException f){
					monthLabelDisplay.setText(String.valueOf("error"));
					dayLabelDisplay.setText(String.valueOf("message"));
					errorMessage.setText(String.valueOf("That is not a valid input :("));
				}
			}
		});
		yearField.setFont(new Font("Arial Black", Font.BOLD, 16));
		yearField.setBounds(178, 39, 135, 39);
		frame.getContentPane().add(yearField);
		yearField.setColumns(10);
		
		JLabel monthLabel = new JLabel("Month:");
		monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		monthLabel.setBounds(20, 87, 85, 38);
		frame.getContentPane().add(monthLabel);
		
		JLabel dayLabel = new JLabel("Day:");
		dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		dayLabel.setBounds(30, 135, 67, 38);
		frame.getContentPane().add(dayLabel);
	}
}
