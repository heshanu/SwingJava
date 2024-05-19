package Swing;
import java.awt.*;
import javax.swing.*;
public class SwingOne extends JFrame {

	public SwingOne() {
		 JFrame jframe = new JFrame();
	//	 jframe.setLayout(new FlowLayout());
		 //jframe.setLayout(new GridLayout(4,2));

	        // Set the title of the JFrame
	        jframe.setTitle("My First JFrame");
	        
	        // Set the size of the JFrame
	        jframe.setSize(1000, 1000);
	       
//	        // Set the operation that will happen by default when the close button is clicked
//	        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	        // Create a panel with a yellow background
//	        JPanel panel = new JPanel();
//	        panel.setBackground(Color.YELLOW);
//	        
//	        JTextArea txtarea=new JTextArea();       
//
//	        // Add the panel to the JFrame
//	        
//	        JButton buttonOne=new JButton("ButtonOne");
//	        JButton buttonTwo=new JButton("ButtonOne");
//	        JButton buttonThree=new JButton("ButtonOne");
//	        JButton buttonFour=new JButton("ButtonOne");
//	        
//	        jframe.add(buttonOne);
//	        jframe.add(buttonTwo);
//	        jframe.add(buttonThree);
//	        jframe.add(buttonFour);
//	        jframe.add(txtarea);
	        
//	        JButton btnZero=new JButton("0");
//	        JButton btnOne=new JButton("1");
//	        JButton btnTwo=new JButton("2");
//	        JButton btnThree=new JButton("3");
//	        JButton btnFour=new JButton("4");
//	        JButton btnFive=new JButton("5");
//	        JButton btnSix=new JButton("6");
//	        JButton btnSeven=new JButton("7");
//	        JButton btnEight=new JButton("8");
//	        JButton btnNine=new JButton("9");
//	        JButton btnEqual=new JButton("=");
//	        JButton btnAdd=new JButton("+");
//	        JButton btnSub=new JButton("-");
//	        JButton btnMul=new JButton("*");
//	        JButton btnDivi=new JButton("/");
//	       
	        JPanel jpanelNorth=new JPanel();
	        JPanel jpanelDisplay=new JPanel();
	        jpanelNorth.setSize(200,300);
	              
	        JPanel jpanel=new JPanel();
	        jpanel.setSize(100,100);
	        jpanel.setLayout(new GridLayout(4,4));
	        jpanel.setBounds(100, 100, 100, 100);
	                
	        JLabel firstNumber=new JLabel("First Number");
	        JTextField oneTextInput=new JTextField(10);
	        
	        JLabel secondNumber=new JLabel("Second Number");
	        JTextField twoTextInput=new JTextField(10);
	        
	        JLabel result=new JLabel("Result");
	        JTextField threeTextInput=new JTextField(10);
	        threeTextInput.setDisabledTextColor(getBackground());
	        
	        JPanel jDisplay=new JPanel();
	        jDisplay.setLayout(new FlowLayout());
	        
	        jDisplay.add(firstNumber);
	        jDisplay.add(oneTextInput);
	        jDisplay.add(secondNumber);
	        jDisplay.add(twoTextInput);
	        jDisplay.add(result);
	        jDisplay.add(threeTextInput);
	        	      
//	        jpanel.add(btnZero);
//	        jpanel.add(btnOne);
//	        jpanel.add(btnTwo);
//	        jpanel.add(btnThree)	;
//	        jpanel.add(btnFour);
//	        jpanel.add(btnFive);
//	        jpanel.add(btnSix);
//	        jpanel.add(btnSeven);
//	        jpanel.add(btnEight)	;
//	        jpanel.add(btnNine);
	        
	        JPanel jpanelOne=new JPanel();

	        jpanelOne.add("North",jDisplay);	
	        jframe.add("North",jpanelDisplay);
	        jframe.add("Center",jpanel);
	        jframe.add("South",jpanelOne);
	        
	        jframe.setVisible(true);
	        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a new JFrame
       new SwingOne();
    }
}

