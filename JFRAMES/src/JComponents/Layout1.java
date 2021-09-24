package JComponents;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 
public class Layout1 implements ActionListener{
	private JLabel label;
	private JFrame frame;
	private JButton button;
	
	int count=0;
	public Layout1() {
		//need in every panel
		frame = new JFrame();
		button=new JButton("CLick me");
		button.addActionListener(this);
		
		JButton button1 = new JButton("CLick me");
		
		label=new JLabel("NUmber of clicks: 0");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,40,40));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(button1);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First");
		frame.pack();
		frame.setVisible(true);
	}
     

     
    public static void main(String[] args) {
    		//code here
    	new Layout1();
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of clicks:"+count);
		
	}
      
}
