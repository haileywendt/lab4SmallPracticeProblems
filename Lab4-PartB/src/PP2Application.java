import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PP2Application {

	private JFrame frame;
	private JTextField numberField;
	PracticeProblem2 phoneNumber = new PracticeProblem2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PP2Application window = new PP2Application();
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
	public PP2Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial Black", Font.BOLD, 16));
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel newNumber = new JLabel("(000)-000-0000");
		newNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
		newNumber.setHorizontalAlignment(SwingConstants.CENTER);
		newNumber.setBounds(53, 156, 279, 38);
		frame.getContentPane().add(newNumber);
		
		JLabel numberLabel = new JLabel("Enter phone number:");
		numberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numberLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		numberLabel.setBounds(10, 41, 206, 38);
		frame.getContentPane().add(numberLabel);
		
		JLabel newNumberLabel = new JLabel("Formatted Number:");
		newNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		newNumberLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		newNumberLabel.setBounds(10, 96, 196, 38);
		frame.getContentPane().add(newNumberLabel);
		
		numberField = new JTextField();
		numberField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long userInput = Long.parseLong(numberField.getText());
				phoneNumber.setNumber(userInput);
				newNumber.setText(phoneNumber.getNumber());
			}
		});
		numberField.setBounds(226, 41, 200, 38);
		frame.getContentPane().add(numberField);
		numberField.setColumns(10);
	}
}
