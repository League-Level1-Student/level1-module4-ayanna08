package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker {

	public static void main(String[] args) {
		
		makeButtons();{
			JOptionPane.showMessageDialog(null, "Make Buttons");
		}
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Joke");
		JButton button2 = new JButton("Punchline");
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
	}

	private static void makeButtons() {
		// TODO Auto-generated method stub
		
	}
}
