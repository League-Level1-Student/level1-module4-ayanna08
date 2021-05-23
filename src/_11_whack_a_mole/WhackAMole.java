package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date timeAtStart = new Date();
	
	void drawButtons(){
		frame.add(panel);
		Random randy = new Random();
	int number = randy.nextInt(20);
	
	for (int i = 0; i < 20; i++) {
		if(i == number) {
			JButton button1 = new JButton();
			button1.setText("MOLE!");
			button1.addActionListener(this);
			panel.add(button1);
		}
		else {
			JButton button1 = new JButton();
			button1.addActionListener(this);
			panel.add(button1);
		}
	}
	frame.setVisible(true);
	frame.pack();
		
	}
	int buttonpressed = 0;
	int molemissed = 0;
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button3 = (JButton) e.getSource();
		if(button3.getText().equals("MOLE!")) {
			buttonpressed += 1;
		}
		
		else {
			molemissed = molemissed + 1;
			JOptionPane.showMessageDialog(null, "MISSED");
			if(molemissed == 5) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
				System.exit(0);
			}
			
		}
		
		if(buttonpressed == 10) {
			endGame(timeAtStart, buttonpressed);
		}
		frame.remove(panel);
		panel = new JPanel();
		drawButtons();
	}
}

