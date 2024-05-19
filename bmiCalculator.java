package Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class bmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("BMI Calculator!");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		JPanel btnPanel=new JPanel();
		
		JLabel lblWeight=new JLabel("Enter Weight in Kg");
		JTextField txtWeight=new JTextField();
		
		JLabel lblHeight=new JLabel("Enter Height in m");
		JTextField txtHeight=new JTextField();
		
		JLabel lblAnswer=new JLabel("Your BMI Is:");
		JTextField txtAnswer=new JTextField();
		txtAnswer.disable();
		
		JButton calBtn=new JButton("Cal");
		JButton clearBtn=new JButton("clear");
		
		calBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double dobWeight=Double.parseDouble(txtWeight.getText());
				double dobHeight=Double.parseDouble(txtHeight.getText());
				double answer=dobWeight/(dobHeight*dobHeight);
				String result = String.format("%.2f", answer);
				txtAnswer.setText(result);
			}
			
		});
		
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtWeight.setText(null);
				txtHeight.setText(null);
				txtAnswer.setText(null);
				
			}
			
		});
		
		panel.add(lblWeight);
		panel.add(txtWeight);
		panel.add(lblHeight);
		panel.add(txtHeight);
		panel.add(lblAnswer);
		panel.add(txtAnswer);
		
		btnPanel.add(calBtn);
		btnPanel.add(clearBtn);
		
		frame.add("Center",panel);
		frame.add("South",btnPanel);
		frame.setVisible(true);

	}

}
