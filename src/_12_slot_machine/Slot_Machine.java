package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {  
	
	void makeButtons(){
		try {
			JPanel panel = new JPanel();
			label0 = createLabelImage("CHERRY.png");
			label1 = createLabelImage("LIME.png");
			label2 = createLabelImage("ORANGE.png");
			button.addActionListener(this);
			panel.add(label0);
			panel.add(label1);
			panel.add(label2);
			panel.add(button);
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	JFrame frame = new JFrame();
	JButton button = new JButton("SPIN");
	JLabel label1;
	JLabel label2;
	JLabel label0;
	

	void picture() {
	Random randy = new Random();
	int number = randy.nextInt(3);
	int numb = randy.nextInt(3);
	int num = randy.nextInt(3);
	try {
	if(number == 0) {
	label0 = createLabelImage("CHERRY.png");
	}
	
	if(number == 1) {
	label0 = createLabelImage("LIME.png");
	}
	
	if(number == 2) {
	label0 = createLabelImage("ORANGE.png");
	}
	
	if(numb == 0) {
	label1 = createLabelImage("CHERRY.png");
	}
	
	if(numb == 1) {
	label1 = createLabelImage("LIME.png");
	}
	
	if(numb == 2) {
	label1 = createLabelImage("ORANGE.png");
	}
	
	if(num == 0) {
	label2 = createLabelImage("CHERRY.png");
	}
	
	if(num == 1) {
	label2 = createLabelImage("LIME.png");
	}
	
	if(num == 2) {
	label2 = createLabelImage("ORANGE.png");
	}
	
	if(number == numb && numb == num) {
		JOptionPane.showMessageDialog(null, "YOU WIN");
	}
}
	catch(Exception e) {
		e.printStackTrace();
	
	}
	}
	

	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * 1.) When the button is pressed, set the JPanel to a new JPanel
		 * 2.) Call picture
		 * 3.) Add all the labels and button back to the new JPanel
		 */
		JPanel panel = new JPanel();
		picture();
		panel.add(label0);
		panel.add(label1);
		panel.add(label2);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		
	}
    

}
