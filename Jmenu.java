package Swing;

import java.awt.Color;

import javax.swing.*;

public class Jmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JTextArea area=new JTextArea();
		JScrollPane myscrollArea=new JScrollPane();
		myscrollArea.setForeground(Color.cyan);
		
		JMenuBar bar=new JMenuBar();
		
		JMenu file=new JMenu("File");
		
		JMenuItem open=new JMenuItem("Open");
		JMenuItem save=new JMenuItem("Save");
		JMenuItem saveAs=new JMenuItem("SaveAs");
		JMenuItem print=new JMenuItem("Print");
		JMenuItem exit=new JMenu("Exit");
		JSeparator sp=new JSeparator();

		file.add(open);
		file.add(save);
		file.add(saveAs);
		file.add(print);
		file.add(sp);
		file.add(exit);
		
		bar.add(file);
		frame.add("North",bar);
		frame.add("Center",myscrollArea);
		frame.setVisible(true);
		
		

	}

}
