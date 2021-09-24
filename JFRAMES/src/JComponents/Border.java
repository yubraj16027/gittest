package JComponents;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;


//5) Write a program to illustrate the use of BorderLayout. [2073] 
public class Border extends JFrame{

	
	public Border(){
	    setLayout(new BorderLayout());
	    add(new JButton("North"),BorderLayout.NORTH);  
	    add(new JButton("SOUTH"),BorderLayout.SOUTH);  
	    add(new JButton("EAST"),BorderLayout.EAST);
	    add(new JButton("WEST"),BorderLayout.WEST);  
	    add(new JButton("CENTER"),BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {  
	   Border border=new Border(); 
	    
	}  
}
