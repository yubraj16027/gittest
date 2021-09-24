package JComponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SIGridBagLayout extends JFrame{

	SIGridBagLayout(){
		setTitle("Simple Interest");
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();  
		gbc.insets=new Insets(5,5,5,5);
		
		gbc.gridx = 0;  
	    gbc.gridy = 0;  
		add(new JLabel("Enter principle"),gbc);
		  
		JTextField P=new JTextField(15);
		gbc.gridx = 1;  
	    gbc.gridy = 0;  
		add(P,gbc);
		
		gbc.gridx = 0;  
	    gbc.gridy = 1;
		add(new JLabel("Enter time"),gbc);
		JTextField T=new JTextField(15);
		gbc.gridx = 1;  
	    gbc.gridy = 1;  
		add(T,gbc);
		
		gbc.gridx = 0;  
	    gbc.gridy = 2;
		add(new JLabel("Enter rate"),gbc);
		JTextField R=new JTextField(15);
		gbc.gridx = 1;  
	    gbc.gridy = 2;  
		add(R,gbc);
		
		JButton calculate= new JButton("calculate simple interest");
		gbc.gridx = 0;  
	    gbc.gridy = 3;  
		add(calculate,gbc);
		
		JTextField output=new JTextField(15);
		gbc.gridx = 1;  
	    gbc.gridy = 3;  
		add(output,gbc);
		output.setEditable(false);
	
	
	calculate.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double p= Double.parseDouble(P.getText());
			double t= Double.parseDouble(T.getText());
			double r= Double.parseDouble(R.getText());
			double SI=(p*t*r)/100;
			output.setText(String.valueOf(SI));	
		}
		
	});
	
	setSize(400,200);
	setVisible(true);
	//setResizable(false);
	
	}
	
	public static void main(String[] args) {
		new SIGridBagLayout();
	}
}
