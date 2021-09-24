package JComponents;
import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.*;

public class Classwork extends JFrame{
	public JLabel Lname,Lemail,Lpass,Lslide,Lcheck;
	public JTextField name,email,pass;
	public Classwork(){
		setLayout(new FlowLayout());
		//setLayout(null);
		add(new JLabel("Enter your name"));
		name=new JTextField(20);
		name.setLocation(50,50);
		add(name);
		
		add(new JLabel("Enter your email"));
		email=new JTextField(20);
		email.setLocation(100,150);
		add(email);
		
		add(new JLabel("Enter Password"));
		pass=new JTextField(20);
		pass.setLocation(300,400);
		add(pass);
		
		
		
		JSlider slider = new JSlider();
		
		slider.setPaintTicks(true);
		
		slider.setPaintLabels(true);
		         
		Hashtable position = new Hashtable();
		position.put(0, new JLabel("18"));
		position.put(20, new JLabel("20"));
		position.put(40, new JLabel("22"));
		position.put(60, new JLabel("24"));
		position.put(80, new JLabel("26"));
		position.put(100, new JLabel("28"));
		     
		add(new JLabel("Choose your age"));
		slider.setLabelTable(position);
		add(slider);
		
		add(new JLabel("Choose your subject"));
		JCheckBox checkBox1 = new JCheckBox("C++"); 
		add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("Java", true);  
		add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("PHP"); 
		add(checkBox3);
		
		JCheckBox checkBox4 = new JCheckBox("Python");  
		add(checkBox4);
		
		add(new JLabel("Choose your country"));
		String country[] = {"select","Nepal","Italy","Australia","Canada","India","China","England"};
		JComboBox country1 = new JComboBox(country);
		
		add(country1).setSize(20,20);
			
			JButton btnsubmit = new JButton("Submit");
			add(btnsubmit).setSize(40,40);
			
			setVisible(true);
	}
	
	public static void main(String[] args) {
		Classwork add=new Classwork();
		add.setTitle("All components");
		add.setSize(350,500);
		add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setResizable(true);
	}


}
