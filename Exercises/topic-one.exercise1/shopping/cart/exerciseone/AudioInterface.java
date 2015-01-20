package shopping.cart.exerciseone;

import java.awt.Component;
import java.net.URL;

import javax.media.Manager;
import javax.media.Player;

public class AudioInterface extends javax.swing.JFrame {
	Player repro;
	URL musicFile;
		
	public AudioInterface() {
		
	
	try {
			musicFile = new URL("file:/C:/Users/Vogels/Downloads/generally/sounds/Funny/yeah.wav");
			repro = Manager.createRealizedPlayer(musicFile);
			Component controls = repro.getControlPanelComponent();
			
			if(controls != null) {
				this.add(controls);
				controls.setLocation(0, 200);
				controls.setSize(300,25);
			}
				
		}
		catch(Exception e) {
			System.out.println("An error ocurred");
		}
	}
}
