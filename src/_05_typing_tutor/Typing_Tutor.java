package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
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
				panel.setBackground(Color.GREEN);
				numberOfcorrectLetters += 1;
			}
			
			else{
				JOptionPane.showMessageDialog(null, "Incorrect");
				panel.setBackground(Color.RED);
			}
			
			 totalNumberofLetters += 1;
			 
			 if( totalNumberofLetters == 10) {
				 showTypingSpeed(numberOfcorrectLetters);
				 System.exit(0);
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
	    
	
		Date timeAtStart = new Date();
	     
		private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		    Date timeAtEnd = new Date();
		    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		    long gameInSeconds = (gameDuration / 1000) % 60;
		    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		    int charactersPerMinute = (int) (charactersPerSecond * 60);
		    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
		} 
		
		int numberOfcorrectLetters = 0;
		int totalNumberofLetters = 0;
}
