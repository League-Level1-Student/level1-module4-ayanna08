package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public Magic8Ball() {
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random randy = new Random();
		int rando = randy.nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog(null, "Enter a yes/no/maybe question for the Magic 8 Ball");
	// 5. If the random number is 0
	// -- tell the user "Yes"
		if(rando == 0) {
			JOptionPane.showMessageDialog(null, "YES");
		}
	// 6. If the random number is 1
	// -- tell the user "No"
		if(rando == 1) {
			JOptionPane.showMessageDialog(null, "NO");
		}
	// 7. If the random number is 2
	// -- tell the user "Maybe you should ask Google?"
		if(rando == 2) {
			JOptionPane.showMessageDialog(null, "MAYBE");
		}
	// 8. If the random number is 3
	// -- write your own answer
		if(rando == 3) {
			JOptionPane.showInputDialog(null, "WRITE YOUR OWN ANSWER");
		}
	}
}
