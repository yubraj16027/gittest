package JComponents;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Write a program using components to add two numbers. Use text fields. For inputs and output. Your
//program should display the result when the user presses a button. [2069] 
public class TextField extends JFrame{
	
	public static void main(String[] args) {
		TextField add=new TextField();
		add.setTitle("Add two numbers");
		add.setSize(180,350);
		add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setResizable(false);
	}
	
	public TextField() {
		setTitle("Add two numbers");
		
		setLayout(new FlowLayout());
		add(new JLabel("Enter First number"));
		JTextField oneTextField = new JTextField(10);
		add(oneTextField);
		add(new JLabel("Enter second number"));
		JTextField secondTextField = new JTextField(10);
		add(secondTextField);
		
		
		
		JButton calculateButton = new JButton("Calculate sum and multiply");
		add(calculateButton);
		
		add(new JLabel("sum"));
		JTextField sumTextField = new JTextField(10);
		sumTextField.setEditable(false);
		add(sumTextField);
		
		
		
		add(new JLabel("multiply"));
		JTextField mulTextField = new JTextField(10);
		mulTextField.setEditable(false);
		add(mulTextField);
		
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				double a= Double.parseDouble(oneTextField.getText());
				double b= Double.parseDouble(secondTextField.getText());
				
				sumTextField.setText(String.valueOf(sum(a,b)));
				mulTextField.setText(String.valueOf(mul(a,b)));
			}
			
			public double sum(double a, double b) {
				double sum=a+b;
				return sum;
			}
			
			public double mul(double a, double b) {
				double mul=a*b;
				return mul;
			}
		});
		
		setVisible(true);
	}
}
