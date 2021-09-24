package JComponents;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SIFlowLayout extends JFrame{
	
	public static void main(String[] args) {
		SIFlowLayout add=new SIFlowLayout();
		add.setTitle("Calculate simple interest");
		add.setSize(250,250);
		add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setResizable(false);
	}
	
	public SIFlowLayout() {
		setTitle("Calculate simple interest");
		
		setLayout(new FlowLayout(1,10,15));
		add(new JLabel("Enter Principle "));
		JTextField oneTextField = new JTextField(12);
		add(oneTextField);
		
		add(new JLabel("Enter Time "));
		JTextField secondTextField = new JTextField(12);
		add(secondTextField);
		
		add(new JLabel("Enter Rate "));
		JTextField thirdTextField = new JTextField(12);
		add(thirdTextField);
		
		
		JButton calculateButton = new JButton("Calculate simple interest");
		add(calculateButton);
		
		JTextField SITextField = new JTextField(20);
		SITextField.setEditable(false);
		add(SITextField);
		
		
		
		
		calculateButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				double p= Double.parseDouble(oneTextField.getText());
				double t= Double.parseDouble(secondTextField.getText());
				double r= Double.parseDouble(thirdTextField.getText());
				double SI=(p*t*r)/100;
				SITextField.setText(String.valueOf(SI));	
			}	
		});
		
		setVisible(true);
	}
}

