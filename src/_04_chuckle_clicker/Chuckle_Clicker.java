package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_nasty_surprise.Nasty_Surprise;

public class Chuckle_Clicker implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	
	
	public static void main(String[] args) {
		Chuckle_Clicker clicker = new Chuckle_Clicker();
		clicker.makeButtons();
	}
		
		void makeButtons(){
			
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

}
		


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()== button1) {
				JOptionPane.showMessageDialog(null,"Q: Why did the chicken cross the road?");
			}
			
			if(e.getSource()== button2) {
				JOptionPane.showMessageDialog(null,"A: To get to the other side");
			}
		}

	
}
