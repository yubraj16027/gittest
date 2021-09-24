package JComponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//7) Create a login form with username and password fields. Print “access granted” if the username and
//password both are “admin”, when user clicks on Login button. If authentication fails, print “access denied”. 

//8) (Optional) Create a basic notepad app with the following features:
//a) New
//b) Open
//c) Save 
//d) Exit

//Use JButton components to implement these features.
//9) Create an application with UI similar to the windows notepad app.
//10) Create the UI for tic-tac-toe app using JButton array and GridLayout 
public class LoginForm extends JFrame{
	
	LoginForm(){
		setTitle("Login form");
		setLayout(new GridLayout(3,3,30,20));
		
		
		add(new JLabel("Username"));
		JTextField name=new JTextField(15);
		add(name);

		
		add(new JLabel("Password"));
		JPasswordField pass=new JPasswordField(15);
		add(pass);
		
		JButton login =new JButton("login");
		add(login);
		
		JLabel label=new JLabel();
		add(label);
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String u=name.getText();
				String p=pass.getText();

				if(p.isEmpty()) {
					if(u.isEmpty()) {
						label.setText("please enter user and password");
					}
					else {
						label.setText("please enter password");
					}
				}
				
				else if(u.equals("admin")) {
					if(p.equals("admin")) {
						label.setText("access granted");
					}
					else {
						label.setText("password wrong");
					}
				}
				else if(!u.equals("admin")) {
					label.setText("user wrong");
				}
				}
		});
		
		setVisible(true);
		setSize(400,200);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new LoginForm();
	}
}
