package bank_managemnt_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	 JButton login,clear,signup;
	 JTextField cardText;
	 JPasswordField pinText;
	 
	public Login() {

		setTitle("Automate Teller Machine");

		setLayout(null);

//		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
//		System.out.println(ClassLoader.getSystemResource("icons/logo.jpg"));

		//ICON
		
		File file = new File("E:\\work\\Java Programs\\BankManagementSystem\\src\\icons\\logo.jpg");
		ImageIcon i1 = new ImageIcon(file.getAbsolutePath());
//		System.out.println(file.getAbsolutePath());

		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);

		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		//TEXT
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200,40,400,40);
		add(text);
		
		JLabel cardno = new JLabel("cardno");
		cardno.setFont(new Font("Osward",Font.BOLD,28));
		cardno.setBounds(150,120,200,30);
		add(cardno);
		
		cardText = new JTextField();
		cardText.setBounds(300,120,250,30);
		cardText.setFont(new Font("Arial",Font.BOLD,14));
		add(cardText);
		
		JLabel pin = new JLabel("pin");
		pin.setFont(new Font("Osward",Font.BOLD,28));
		pin.setBounds(150,180,200,30);
		
		add(pin);
		
		pinText = new JPasswordField();
		pinText.setBounds(300,180,250,30);
		pinText.setFont(new Font("Arial",Font.BOLD,14));
		add(pinText);
		
		login = new JButton("Sign IN");
		login.setBounds(300, 250,100,30);
		login.setBackground(Color.GREEN);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);

		clear = new JButton("Clear");
		clear.setBounds(450, 250,100,30);
		clear.setBackground(Color.red);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("Sign Up");
		signup.setBounds(300, 300,250,30);
		signup.setBackground(Color.blue);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.WHITE);
		
		//FIELD
		setSize(800, 480);
		setVisible(true);
		setLocation(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==login) {
			
		}else if (e.getSource()==signup) {
				
		}else if (e.getSource()==clear) {
			cardText.setText("");
			pinText.setText("");
		}
		
	}
}
