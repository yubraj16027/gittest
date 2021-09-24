package JComponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener{
	JFrame f;
	JPanel mp,gp;
	public JLabel pl,pln;
	
	public JButton pa;
	JButton[] js=new JButton[9];
	
	int CountClick=0;
	
	TicTacToe(){

		f=new JFrame();
		mp=new JPanel();	//menu panel
		gp=new JPanel();	//game panel
		
		mp.setLayout(new BorderLayout(10,10));
		mp.setBackground(new Color(157, 163, 159));
		mp.setBounds(0,0,400,100);
		
		pl=new JLabel("PLayer");
		pl.setFont(new Font("Chiller",  Font.BOLD, 40));
		
		pln=new JLabel("X");	//player turn
		pln.setFont(new Font("Chiller",  Font.BOLD, 40));
		
		pa=new JButton("PLay again");
		pa.setFont(new Font("Chiller",  Font.BOLD, 40));
		pa.setVisible(false);
		pa.setBackground(new Color(157, 163, 159));
		pa.setFocusPainted(false);
		pa.setBorderPainted(false);
		
		
		
		
		mp.add(pl,BorderLayout.WEST);
		mp.add(pln,BorderLayout.CENTER);
		mp.add(pa,BorderLayout.EAST);
		
		gp.setLayout(new GridLayout(3,3));
		
		for(int i=0;i<9;i++) {
			js[i]=new JButton("");
			js[i].setFont(new Font("Chiller",  Font.PLAIN, 100));
			js[i].setForeground(Color.white);
			js[i].setBackground(Color.black);
			js[i].setFocusPainted(false);
			js[i].setFocusable(false);
			
			gp.add(js[i]);
			js[i].addActionListener(this);
		}
		
		  
		
		f.add(mp,BorderLayout.NORTH);
		f.add(gp);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\class\\java\\JFRAMES\\img\\ttt1.png");  
		f.setIconImage(icon); 
		f.setTitle("TicTacToe");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setResizable(false);
		//check();
		
		pa.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
					for(int i=0;i<9;i++) {
						js[i].setText("");
						js[i].setEnabled(true);
						pl.setVisible(true);
						pln.setText("O");
						pa.setVisible(false);
					}
			}	
		});
	}
	
	public void check() {

		for(int i=0;i<9;i++) {
			//X
			if(js[0].getText()=="X" && js[1].getText()== "X" && js[2].getText()=="X") {
				xwin();
			}
			else if(js[0].getText()=="X" && js[3].getText()== "X" && js[6].getText()=="X"){
				xwin();
			}
			else if(js[0].getText()=="X" && js[4].getText()== "X" && js[8].getText()=="X"){
				xwin();
			}
			else if(js[1].getText()=="X" && js[4].getText()== "X" && js[7].getText()=="X"){
				xwin();
			}
			else if(js[2].getText()=="X" && js[4].getText()== "X" && js[6].getText()=="X"){
				xwin();
			}
			else if(js[6].getText()=="X" && js[7].getText()== "X" && js[8].getText()=="X"){
				xwin();
			}
			else if(js[2].getText()=="X" && js[5].getText()== "X" && js[8].getText()=="X"){
				xwin();
			}
			else if(js[3].getText()=="X" && js[4].getText()== "X" && js[5].getText()=="X"){
				xwin();
			}
			// O
			else if(js[0].getText()=="O" && js[1].getText()== "O" && js[2].getText()=="O"){
				owin();
			}
			else if(js[0].getText()=="O" && js[3].getText()== "O" && js[6].getText()=="O"){
				owin();
			}
			else if(js[0].getText()=="O" && js[4].getText()== "O" && js[8].getText()=="O"){
				owin();
			}
			else if(js[1].getText()=="O" && js[4].getText()== "O" && js[7].getText()=="O"){
				owin();
			}
			else if(js[2].getText()=="O" && js[4].getText()== "O" && js[6].getText()=="O"){
				owin();
			}
			else if(js[6].getText()=="O" && js[7].getText()== "O" && js[8].getText()=="O"){
				owin();
			}
			else if(js[2].getText()=="O" && js[5].getText()== "O" && js[8].getText()=="O"){
				owin();
			}
			else if(js[3].getText()=="O" && js[4].getText()== "O" && js[5].getText()=="O"){
				owin();
			}
			else if(CountClick==9) {
				draw();
			}
		}
	}
	
	private void draw() {
		for(int i=0;i<9;i++) {
			js[i].setEnabled(false);
			pl.setVisible(false);
			pln.setText("Game draw");
			pa.setVisible(true);
			
		}
		
	}

	public void xwin(){
		for(int i=0;i<9;i++) {
			js[i].setEnabled(false);
			pln.setText("X wins");
			pa.setVisible(true);
			
		}
	}
		
		public void owin(){
			for(int i=0;i<9;i++) {
				js[i].setEnabled(false);
				pln.setText("O wins");
				pa.setVisible(true);
			}
		}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			if(e.getSource()==js[i]) {
				if(pln.getText()=="X") {
					if(js[i].getText() == "") {
						js[i].setText("X");
						
						pln.setText("O");
						CountClick++;
						check();
					}					
				}
				else {
					if(js[i].getText() == "") {
						js[i].setText("O");
						
						pln.setText("X");
						CountClick++;
						check();
					}
				}

			}
		}
	}


	
	public static void main(String[] args) {
		new TicTacToe();
	}


}
