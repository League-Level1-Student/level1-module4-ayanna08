package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Surprise implements ActionListener {
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
String url1 = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg";
String url2 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRP54oXhuzaeL_LGBTvjh9iIwai-Rz9ya713g&usqp=CAU";
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
	
	if(arg0.getSource()== button1) {
		showPictureFromTheInternet(url1);
	}
	
	if(arg0.getSource()== button2) {
		showPictureFromTheInternet(url2);
	}
	
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}
