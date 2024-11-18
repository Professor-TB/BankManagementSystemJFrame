package bank_managemnt_system;

import java.awt.Color;
import java.awt.Font;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {

	public SignUpOne() {

		setLayout(null);

		Random rand = new Random();
//		System.out.println(Math.abs(rand.nextLong()%10000));
		long random = Math.abs(rand.nextLong() % 10000);

		JLabel formno = new JLabel("Application From No. " + random);
		formno.setFont(new Font("Arial", Font.BOLD, 28));
		formno.setBounds(170, 10, 400, 70);
		add(formno);

		JLabel personalDetails = new JLabel("Page 1: Personal Deatils");
		personalDetails.setFont(new Font("Arial", Font.BOLD, 20));
		personalDetails.setBounds(220, 60, 250, 70);
		add(personalDetails);

		String[] labelsText = { 
				"Name: ",
				"Father's Name: ",
				"Date of Birth: ",
				"Gender: ",
				"Email: ",
				"Marital Status: ",
				"Address: ", 
				"City: ", 
				"State: ", 
				"Pin Code: " 
				};

		Set<Integer> positionsWithoutTextField = new HashSet<>();
		positionsWithoutTextField.add(180);
		positionsWithoutTextField.add(210);
		positionsWithoutTextField.add(270);

		int yPosition = 120;
		for (String labelText : labelsText) {
			addLabel(labelText, yPosition);
			if (!positionsWithoutTextField.contains(yPosition)) {
				addTextField(yPosition);
			}
			yPosition += 30;
		}

		JDateChooser dobChooser = new JDateChooser();
		dobChooser.setBounds(300, 180, 250, 30);
		add(dobChooser);

		radioButton("Male", 300, 210, 70, genderGroup);
		radioButton("Female", 370, 210, 70, genderGroup);
		radioButton("Others", 440, 210, 70, genderGroup);
		
		radioButton("Married", 300, 270, 70, maritalGroup);
		radioButton("Unmarried", 370, 270, 90, maritalGroup);
		radioButton("Others", 460, 270, 90, maritalGroup);
		
		JButton next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(460,480,80,30);
		add(next);

		setSize(650, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(Color.WHITE);

	}

	private void addLabel(String text, int yPosition) {
		JLabel label = new JLabel(text);
		label.setFont(new Font("Raleway", Font.BOLD, 16));
		label.setBounds(80, yPosition, 250, 20);
		add(label);
	}

	private void addTextField(int yPosition) {
		JTextField nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
		nameTextField.setBounds(300, yPosition, 250, 30);
		add(nameTextField);
	}
	
	private void radioButton(String text, int xPosition, int yPosition, int width, ButtonGroup group) {
		JRadioButton button = new JRadioButton(text);
		button.setBounds(xPosition, yPosition, width, 30);
		button.setBackground(Color.WHITE);
		group.add(button);
		add(button);
	}

	ButtonGroup genderGroup = new ButtonGroup();
	ButtonGroup maritalGroup = new ButtonGroup();

	public static void main(String[] args) {
		new SignUpOne();
	}
}
