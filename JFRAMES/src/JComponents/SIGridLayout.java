package JComponents;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.*;

import javax.swing.*;

//6) Write a program to calculate simple interest using

//b) GridLayout
//c) GridBagLayout
public class SIGridLayout extends JFrame{
	
	SIGridLayout(){
		//JFrame J1=new JFrame();
		setTitle("Simple Interest with grid layout");
		setLayout(new GridLayout(5,2,12,14));
		
		add(new JLabel("Enter principle"));
		JTextField P=new JTextField(15);
		add(P);
		
		add(new JLabel("Enter time"));
		JTextField T=new JTextField(15);
		add(T);
		
		add(new JLabel("Enter rate"));
		JTextField R=new JTextField(15);
		add(R);
		
		JButton calculate= new JButton("calculate simple interest");
		add(calculate);
		
		JTextField output=new JTextField(15);
		add(output);
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
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new SIGridLayout();
	}
}
