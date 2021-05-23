package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slot_Machine {
	
	JFrame frame = new JFrame();
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	void makeButtons(){
		try {
			label1 = createLabelImage("cherry.jpg");
			label2 = createLabelImage("lime.jpg");
			label3 = createLabelImage("orange.jpg");
			
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
