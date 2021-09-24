package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class notepad extends JFrame implements ActionListener{
	public JFrame f;
	public JMenu file,edit,help,format,view;
	public JMenuItem New,open,save,exit,cut,copy,paste,selectAll;
	public JTextArea tf;
	public JFileChooser fileChooser;
	
	Clipboard clip ;
	notepad(){
		f=new JFrame();
		
		New=new JMenuItem("New          CTRL+N");    
		open=new JMenuItem("open         CTRL+O");    
		save=new JMenuItem("save          CTRL+S");    
		exit=new JMenuItem("Exit"); 
		OpenListener openL = new OpenListener();
		NewListener NewL = new NewListener();
		SaveListener saveL = new SaveListener();  
		ExitListener exitL = new ExitListener();
		open.addActionListener(openL);
		New.addActionListener(NewL);
		save.addActionListener(saveL);
		exit.addActionListener(exitL);
		
		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");    
		selectAll=new JMenuItem("SelectAll");  
		
		cut.addActionListener(this);    
		copy.addActionListener(this);    
		paste.addActionListener(this);    
		selectAll.addActionListener(this);  
		
		JMenuBar mb=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		format=new JMenu("Format");
		view=new JMenu("View");
		help=new JMenu("Help");
		tf=new JTextArea();
		
		
		
		mb.add(file); mb.add(edit); mb.add(format); mb.add(view); mb.add(help); 
		
		file.add(New); file.add(open); file.add(save); file.add(exit);
		
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
		tf.setBounds(0,0,490,450); 
		
		f.add(mb);f.add(tf);
		
		f.setTitle("Notepad");
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\class\\java\\JFRAMES\\img\\notepad.jpg");    
		f.setIconImage(icon);    
		f.setJMenuBar(mb);  
		f.setLayout(null);    
		f.setSize(500,500); 
		f.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new notepad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cut) 
			tf.cut();
		if(e.getSource()==paste)    
			tf.paste();    
		if(e.getSource()==copy)    
			tf.copy();    
		if(e.getSource()==selectAll)    
			tf.selectAll(); 
		
	}
	
	class OpenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(f)) {
				File file = fileChooser.getSelectedFile();
				tf.setText("");
				Scanner in = null;
				try {
					in = new Scanner(file);
					while(in.hasNext()) {
						String line = in.nextLine();
						tf.append(line+"\n");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					in.close();
				}
			}
		}
	}
	
	class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(f)) {
				File file = fileChooser.getSelectedFile();
				PrintWriter out = null;
				try {
					out = new PrintWriter(file);
					String output = tf.getText();
					System.out.println(output);
					out.println(output);
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					try {
						out.flush();
						} catch(Exception ex1) 
						{
							
						}
					try {
						out.close();
						} catch(Exception ex1) {
							
						}
				}
			}
		}
	}
	
	class NewListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			tf.setText("");
			f.add(New);
		//	textArea.(newFile+"\n");
			
			
			
		}
	}
	
	class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
