package JComponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Design a GUI form using swing with a text field, a text label for displaying the input message “Input any
//string”, and three buttons with caption “Check Palindrome”, “Reverse”, “Find Vowels”. Write a complete
//program for above scenario and for checking palindrome in first button, reverse it after clicking second button
//and extract the vowels from it after clicking third button. [2075] 
public class Palindrome extends JFrame{
	JLabel Label;
	
	public Palindrome() {
		
		setLayout(new FlowLayout());
		
		add(new JLabel("Input text"));
		JTextField InputField=new JTextField(15);
		add(InputField);
		
		JButton Palindrome=new JButton("Check Palindrome");
		add(Palindrome);
		
		JButton Reverse= new JButton(" Reverse");
		add(Reverse);
		
		JButton Vowels= new JButton("Find Vowels");
		add(Vowels);
		
		Label=new JLabel("No text entered");
		add(Label);
	
	
	Palindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String P=InputField.getText();
				String temp=P;
				char temp1[]=temp.toCharArray();  
				String rev="";
				for(int i=temp1.length-1;i>=0;i--) {
					rev+=temp1[i];
				}
				//Label.setText(rev + " "+ P);
				if(P.isEmpty()) {
					Label.setText("Please enter a text");
				}
				else if(P.equals(rev)) {
					Label.setText("This text is Palindrome");
				}
				else if(!P.equals(rev)) {
					Label.setText("Not a Palindrome");
				}
				
			}

	});
	
	Reverse.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			String R=InputField.getText();
			String temp=R;
			char temp1[]=temp.toCharArray();  
			String rev="";
			for(int i=temp1.length-1;i>=0;i--) {
				rev+=temp1[i];
			}
			if(R.isEmpty()) {
				Label.setText("Please enter a text");
			}
			else
			Label.setText(rev);
		}
	});
	
	Vowels.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			String str=InputField.getText();
			str = str.toLowerCase();    
			 
			char[] vowel = new char[str.length()];
			char[] v = null;
			String vowellist="";  
	        for(int i = 0; i < str.length(); i++) {    
	        	
	            if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' ||str.charAt(i)=='u') {    
	                
	            	vowel[i]=str.charAt(i);
	            	vowellist  =vowellist+String.valueOf(vowel[i]);
	            }  
	            Label.setText(vowellist);
	        }
	        
		}
	});
	
	setVisible(true);
	}	
	public static void main(String[] args) {
		Palindrome add=new Palindrome();
		add.setTitle("GUI");
		add.setSize(200,250);
		add.setDefaultCloseOperation(EXIT_ON_CLOSE);
		add.setResizable(false);
		
		
	}
}
