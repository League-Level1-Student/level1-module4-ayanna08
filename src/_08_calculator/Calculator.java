package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements Runnable, ActionListener {
	
	void makeButtons(){
	
		JPanel panel = new JPanel();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button1);
		panel.add(button2); 
		panel.add(button3);
		panel.add(button4);
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	JButton button1 = new JButton("Add");
	
	JButton button2 = new JButton("Subtract");
	
	JButton button3 = new JButton("Multiply");
	
	JButton button4 = new JButton("Divide");
	
	JFrame frame = new JFrame();
	
		
		int add(int num1, int num2){
		int sum = num1 + num2;
		return sum;
		}
	
		int subtraction(int num1, int num2){
		int sum = num1 - num2;
		return sum;
		}
		
		int multiplication(int num1, int num2){
		int sum = num1 * num2;
		return sum;
		}
		
		int division(int num1, int num2){
		int sum = num1 / num2;
		return sum;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		JTextField textfield = new JTextField(5);
		JTextField textfield2 = new JTextField(5);
		JLabel label = new JLabel();

		@Override
		public void actionPerformed(ActionEvent arg0) {
		String num1 = textfield.getText();
		int numb1 = Integer.parseInt(num1);
	
		String num2 = textfield2.getText();
		int numb2 = Integer.parseInt(num2);
		
		if(arg0.getSource().equals(button1)) {
			int sum = add(numb1, numb2);
			label.setText("" + sum);
			
		}
		
		if(arg0.getSource().equals(button2)) {
			int sum = subtraction(numb1, numb2);
			label.setText("" + sum);
			
		}
			
		if(arg0.getSource().equals(button3)) {
			int sum = multiplication(numb1, numb2);
			label.setText("" + sum);
			
		}
		
		if(arg0.getSource().equals(button4)) {
			int sum = division(numb1, numb2);
			label.setText("" + sum);
			
		}
		frame.pack();
		}
}
