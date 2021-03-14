package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
	public static void main(String[] args) {
			  Typing_Tutor tutor = new Typing_Tutor();
			  tutor.setup(); 
			   }
			              
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
		
		 void setup(){
	         JFrame frame = new JFrame();
	         frame.addKeyListener(this);
	         panel.add(label);
	         frame.add(panel);
	         currentLetter = generateRandomLetter();
	         label.setText("" + currentLetter);
	         label.setFont(label.getFont().deriveFont(28.0f));
	         label.setHorizontalAlignment(JLabel.CENTER);
	         frame.pack();
	         frame.setVisible(true);
	         }
		 
		  JLabel label = new JLabel();
		  JPanel panel = new JPanel();
		 char currentLetter;{
			 
		 }

		@Override
		public void keyPressed(KeyEvent arg0) {
			System.out.println("You typed: " + arg0.getKeyChar());
			
			if(arg0.getKeyChar() == currentLetter) {
				JOptionPane.showMessageDialog(null, "Correct");
				panel.setBackground(g);
			}
			
			else{
				JOptionPane.showMessageDialog(null, "Incorrect");
				panel.setBackground(r);
			}
			
			
			//after here is keyReleased
			currentLetter = generateRandomLetter();
			label.setText("" + currentLetter);
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	    
	

}
