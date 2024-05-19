package Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

class Details{
	private String name;
	public String getName() {
		return name;
	}
	public Details(String name, String address, String city, int age) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String address;
	private String city;
	private int age;
}

public class UOVTRegisterForm {
    public static void main(String[] args) {
        JFrame form = new JFrame("Registration Form");
        form.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        
        JPanel tblPanel=new JPanel();

        // form components
        JPanel footer = new JPanel();
   
    	JLabel name=new JLabel("Name");
		JTextField inputName=new JTextField(10);
		
		JLabel address=new JLabel("Address");
		JTextField inputAddress=new JTextField(10);
		
		JLabel city=new JLabel("City");
		JTextField inputCity=new JTextField(10);
		
		JLabel age=new JLabel("Age");
		JTextField inputAge=new JTextField(10);
		
        
        JButton addBtn = new JButton("ADD");
        JButton cancelBtn = new JButton("CANCEL");
        	
        ArrayList<Details> details = new ArrayList<>();
        String[] columnNames = {"Name", "Address", "City", "Age"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(table);

        form.add(scrollPane, BorderLayout.CENTER);

        addBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String name = inputName.getText();
                String address = inputAddress.getText();
                String city = inputCity.getText();
                String age = inputAge.getText();
                int intAge = Integer.parseInt(age);
                Details person = new Details(name, address, city, intAge);
                details.add(person);
                tableModel.addRow(new Object[]{person.getName(), person.getAddress(), person.getCity(), person.getAge()});
                String[] columnNames = {"Name", "Address", "City", "Age"};
                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            }
        });
        
        cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				   inputName.setText(null);
	                inputAddress.setText(null);
	                inputCity.setText(null);
	                inputAge.setText(null);
				
			}
        	
        });
        	
        
        
     // add form components to panel
    	panel.add(name);
		panel.add(inputName);
		
		panel.add(address);
		panel.add(inputAddress);
		
		panel.add(city);
		panel.add(inputCity);
		
		panel.add(age);
		panel.add(inputAge);
		
	    tblPanel.add(table);
	    
        Container content = form.getContentPane();
        content.setLayout(new BorderLayout());
        
        
        footer.add(addBtn);
        footer.add(cancelBtn);
        
 
        form.add("North",panel);
        form.add("Center",tblPanel);
        form.add("South", footer);

        form.setVisible(true);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }
 }