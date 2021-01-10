package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Nasty_Surprise implements ActionListener {
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton("Trick");
JButton button2 = new JButton("Treat");

public static void main(String[] args) {
		Nasty_Surprise surprise = new Nasty_Surprise();
		surprise.makebuttons();
	}
	
void makebuttons(){
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
	frame.setVisible(true);

		
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}

}
