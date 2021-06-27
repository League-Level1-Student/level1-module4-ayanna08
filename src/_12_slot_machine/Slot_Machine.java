package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine {  
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
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
	label0 = createLabelImage("cherry.jpg");
	}
	
	if(number == 1) {
	label0 = createLabelImage("lime.jpg");
	}
	
	if(number == 2) {
	label0 = createLabelImage("orange.jpg");
	}
	
	if(numb == 0) {
	label1 = createLabelImage("cherry.jpg");
	}
	
	if(numb == 1) {
	label1 = createLabelImage("lime.jpg");
	}
	
	if(numb == 2) {
	label1 = createLabelImage("orange.jpg");
	}
	
	if(num == 0) {
	label2 = createLabelImage("cherry.jpg");
	}
	
	if(numb == 1) {
	label2 = createLabelImage("lime.jpg");
	}
	
	if(num == 2) {
	label2 = createLabelImage("orange.jpg");
	}
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	void makeButtons(){
		try {
			label0 = createLabelImage("cherry.jpg");
			label1 = createLabelImage("lime.jpg");
			label2 = createLabelImage("orange.jpg");
			
			//panel.add(label0);
			panel.add(label1);
			panel.add(label2);
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
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
    

}
