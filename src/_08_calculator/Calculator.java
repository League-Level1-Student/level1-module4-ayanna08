package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Calculator implements Runnable {
	public static void main(String[] args) {
		
		}
	void makeButtons(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JOptionPane.showInputDialog("Enter two numbers and select if you want them added, subtracted, multiplied, or divided");
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
		
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
}
