import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PP3Application {

	private JFrame frame;
	private JTextField inputAX;
	private JTextField inputAY;
	private JTextField inputBX;
	private JTextField inputBY;
	private JTextField inputCX;
	private JTextField inputCY;
	
	PracticeProblem3 triangle = new PracticeProblem3();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PP3Application window = new PP3Application();
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
	public PP3Application() {
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
		
		JLabel xLabel = new JLabel("X");
		xLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		xLabel.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel.setBounds(115, 0, 20, 26);
		frame.getContentPane().add(xLabel);
		
		JLabel yLabel = new JLabel("Y");
		yLabel.setHorizontalAlignment(SwingConstants.CENTER);
		yLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		yLabel.setBounds(215, 0, 20, 26);
		frame.getContentPane().add(yLabel);
		
		JLabel angleLabel = new JLabel("Angle, deg.");
		angleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		angleLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		angleLabel.setBounds(300, 0, 110, 26);
		frame.getContentPane().add(angleLabel);
		
		JLabel inputALabel = new JLabel("Input A:");
		inputALabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputALabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputALabel.setBounds(10, 25, 75, 26);
		frame.getContentPane().add(inputALabel);
		
		JLabel inputBLabel = new JLabel("Input B:");
		inputBLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputBLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputBLabel.setBounds(10, 55, 75, 26);
		frame.getContentPane().add(inputBLabel);
		
		JLabel inputCLabel = new JLabel("Input C:");
		inputCLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inputCLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputCLabel.setBounds(10, 85, 75, 26);
		frame.getContentPane().add(inputCLabel);
		
		inputAX = new JTextField();
		inputAX.setHorizontalAlignment(SwingConstants.CENTER);
		inputAX.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputAX.setText("0.0");
		inputAX.setBounds(90, 25, 75, 26);
		frame.getContentPane().add(inputAX);
		inputAX.setColumns(10);
		
		inputAY = new JTextField();
		inputAY.setText("0.0");
		inputAY.setHorizontalAlignment(SwingConstants.CENTER);
		inputAY.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputAY.setColumns(10);
		inputAY.setBounds(188, 25, 75, 26);
		frame.getContentPane().add(inputAY);
		
		inputBX = new JTextField();
		inputBX.setHorizontalAlignment(SwingConstants.CENTER);
		inputBX.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputBX.setText("0.0");
		inputBX.setColumns(10);
		inputBX.setBounds(90, 55, 75, 26);
		frame.getContentPane().add(inputBX);
		
		inputBY = new JTextField();
		inputBY.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputBY.setHorizontalAlignment(SwingConstants.CENTER);
		inputBY.setText("0.0");
		inputBY.setColumns(10);
		inputBY.setBounds(188, 55, 75, 26);
		frame.getContentPane().add(inputBY);
		
		inputCX = new JTextField();
		inputCX.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputCX.setHorizontalAlignment(SwingConstants.CENTER);
		inputCX.setText("0.0");
		inputCX.setColumns(10);
		inputCX.setBounds(90, 85, 75, 26);
		frame.getContentPane().add(inputCX);
		
		inputCY = new JTextField();
		inputCY.setText("0.0");
		inputCY.setHorizontalAlignment(SwingConstants.CENTER);
		inputCY.setFont(new Font("Arial Black", Font.PLAIN, 14));
		inputCY.setColumns(10);
		inputCY.setBounds(188, 85, 75, 26);
		frame.getContentPane().add(inputCY);
		
		JLabel degreeALabel = new JLabel("00.00");
		degreeALabel.setHorizontalAlignment(SwingConstants.CENTER);
		degreeALabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		degreeALabel.setBounds(320, 25, 75, 26);
		frame.getContentPane().add(degreeALabel);
		
		JLabel degreeBLabel = new JLabel("00.00");
		degreeBLabel.setHorizontalAlignment(SwingConstants.CENTER);
		degreeBLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		degreeBLabel.setBounds(320, 55, 75, 26);
		frame.getContentPane().add(degreeBLabel);
		
		JLabel degreeCLabel = new JLabel("00.00");
		degreeCLabel.setHorizontalAlignment(SwingConstants.CENTER);
		degreeCLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		degreeCLabel.setBounds(320, 85, 75, 26);
		frame.getContentPane().add(degreeCLabel);
		
		JLabel lenABLabel = new JLabel("Len(AB):");
		lenABLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lenABLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lenABLabel.setBounds(10, 115, 75, 26);
		frame.getContentPane().add(lenABLabel);
		
		JLabel lenACLabel = new JLabel("Len(AC):");
		lenACLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lenACLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lenACLabel.setBounds(10, 145, 75, 26);
		frame.getContentPane().add(lenACLabel);
		
		JLabel lenBCLabel = new JLabel("Len(BC):");
		lenBCLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lenBCLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lenBCLabel.setBounds(10, 175, 75, 26);
		frame.getContentPane().add(lenBCLabel);
		
		JLabel perimeterLabel = new JLabel("Perimeter:");
		perimeterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		perimeterLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		perimeterLabel.setBounds(188, 145, 85, 26);
		frame.getContentPane().add(perimeterLabel);
		
		JLabel areaLabel = new JLabel("Area:");
		areaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		areaLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		areaLabel.setBounds(188, 175, 75, 26);
		frame.getContentPane().add(areaLabel);
		
		JLabel lenAB = new JLabel("0.00");
		lenAB.setHorizontalAlignment(SwingConstants.CENTER);
		lenAB.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lenAB.setBounds(90, 115, 75, 26);
		frame.getContentPane().add(lenAB);
		
		JLabel lenAC = new JLabel("0.00");
		lenAC.setHorizontalAlignment(SwingConstants.CENTER);
		lenAC.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lenAC.setBounds(90, 145, 75, 26);
		frame.getContentPane().add(lenAC);
		
		JLabel lenBC = new JLabel("0.00");
		lenBC.setHorizontalAlignment(SwingConstants.CENTER);
		lenBC.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lenBC.setBounds(90, 175, 75, 26);
		frame.getContentPane().add(lenBC);
		
		JLabel perimeter = new JLabel("0.00");
		perimeter.setHorizontalAlignment(SwingConstants.CENTER);
		perimeter.setFont(new Font("Arial Black", Font.PLAIN, 14));
		perimeter.setBounds(320, 145, 75, 26);
		frame.getContentPane().add(perimeter);
		
		JLabel area = new JLabel("0.00");
		area.setHorizontalAlignment(SwingConstants.CENTER);
		area.setFont(new Font("Arial Black", Font.PLAIN, 14));
		area.setBounds(320, 175, 75, 26);
		frame.getContentPane().add(area);
		
		JButton calcButton = new JButton("Calculate Triangle Properties");
		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempAX = Double.parseDouble(inputAX.getText());
				double tempAY = Double.parseDouble(inputAY.getText());
				double tempBX = Double.parseDouble(inputBX.getText());
				double tempBY = Double.parseDouble(inputBY.getText());
				double tempCX = Double.parseDouble(inputCX.getText());
				double tempCY = Double.parseDouble(inputCY.getText());
				lenAB.setText(String.format("%.2f", triangle.getLengthAB(tempAX, tempAY, tempBX, tempBY)));
				lenAC.setText(String.format("%.2f", triangle.getLengthAC(tempAX, tempAY, tempCX, tempCY)));
				lenBC.setText(String.format("%.2f", triangle.getLengthBC(tempBX, tempBY, tempCX, tempCY)));
				triangle.setLengthAB(triangle.getLengthAB(tempAX, tempAY, tempBX, tempBY));
				triangle.setLengthAC(triangle.getLengthAC(tempAX, tempAY, tempCX, tempCY));
				triangle.setLengthBC(triangle.getLengthBC(tempBX, tempBY, tempCX, tempCY));
				perimeter.setText(String.format("%.2f", triangle.getPerimeter()));
				area.setText(String.format("%.2f", triangle.getArea()));
				degreeALabel.setText(String.format("%.2f", triangle.getAngleA()));
				degreeBLabel.setText(String.format("%.2f", triangle.getAngleB()));
				degreeCLabel.setText(String.format("%.2f", triangle.getAngleC()));
			}
		});
		calcButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		calcButton.setBounds(10, 227, 416, 26);
		frame.getContentPane().add(calcButton);
	}
}