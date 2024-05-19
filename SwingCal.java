package Swing;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingCal extends JFrame{
			SwingCal(){
				JFrame jframe = new JFrame();
				
				jframe.setTitle("Swing Arithmatics");
				        // Set the size of the JFrame
			    jframe.setSize(300, 300);
			    jframe.setLayout(new FlowLayout());
			    
			    JPanel jpanelDisplayFirst=new JPanel();
			    jpanelDisplayFirst.setLayout(new GridLayout(3,2));
			    
			    jpanelDisplayFirst.setBounds(100, 100, 100, 25);
			    
			    JLabel firstNumber=new JLabel("First Number");	
			    JTextField firstNumberInput=new JTextField(10);
			    JLabel secondNumber=new JLabel("Second Number");	
			    JTextField secondNumberInput=new JTextField(10);
			    JLabel resultNumber=new JLabel("Result");	
			    JTextField resultNumberInput=new JTextField(10);
			    resultNumberInput.setDisabledTextColor(getBackground());
			    
			    JPanel operatorPanel=new JPanel();

		        JButton btnAdd=new JButton("+");
		        
		        JButton btnSub=new JButton("-");
		        JButton btnMul=new JButton("*");
		        JButton btnDiv=new JButton("/");
		        JButton btnModul=new JButton("%");
		        JButton btnClear=new JButton("CLEAR");
		        
		        btnAdd.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						int firstn=Integer.parseInt(firstNumberInput.getText());
						int secondn=Integer.parseInt(secondNumberInput.getText());
						
						int result=firstn+secondn;
						resultNumberInput.setText(String.valueOf(result));
					
						
					}
		        	
		        });
		        
		        btnSub.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						int firstn=Integer.parseInt(firstNumberInput.getText());
						int secondn=Integer.parseInt(secondNumberInput.getText());
						
						int result=firstn-secondn;
						resultNumberInput.setText(String.valueOf(result));
						
						
					}
		        	
		        });
		        
		        btnDiv.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						int firstn=Integer.parseInt(firstNumberInput.getText());
						int secondn=Integer.parseInt(secondNumberInput.getText());
						
						int result=firstn/secondn;
						resultNumberInput.setText(String.valueOf(result));
						
						
					}
		        	
		        });
		        
		        btnMul.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						int firstn=Integer.parseInt(firstNumberInput.getText());
						int secondn=Integer.parseInt(secondNumberInput.getText());
						
						int result=firstn*secondn;
						resultNumberInput.setText(String.valueOf(result));
						
						
					}
		        	
		        });
			    
		        btnModul.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						int firstn=Integer.parseInt(firstNumberInput.getText());
						int secondn=Integer.parseInt(secondNumberInput.getText());
						
						int result=firstn%secondn;
						resultNumberInput.setText(String.valueOf(result));
										
					}
		        	
		        });
		        
		        btnClear.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						firstNumberInput.setText("0");
						secondNumberInput.setText("0");
	
						
						resultNumberInput.setText("0");
						
						
					}
		        	
		        });
		        
		        operatorPanel.setLayout(new GridLayout(3,2));
		        operatorPanel.setSize(500,500);
		        operatorPanel.setBounds(250, 250, 500, 250);
		        operatorPanel.add(btnAdd);
		        operatorPanel.add(btnSub);
		        operatorPanel.add(btnMul);
		        operatorPanel.add(btnDiv);
		        operatorPanel.add(btnModul);
		        operatorPanel.add(btnClear);
		         
		        
			    jpanelDisplayFirst.add(firstNumber);
			    jpanelDisplayFirst.add(firstNumberInput);
			    jpanelDisplayFirst.add(secondNumber);
			    jpanelDisplayFirst.add(secondNumberInput);
			    jpanelDisplayFirst.add(resultNumber);
			    jpanelDisplayFirst.add(resultNumberInput);
			   
			    jframe.add("Center",jpanelDisplayFirst);
			    jframe.add("South",operatorPanel);
			   
		        jframe.setVisible(true);
		        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		        
		        
			}
		

	public static void main(String[] args) {
		new SwingCal();
	}

}
