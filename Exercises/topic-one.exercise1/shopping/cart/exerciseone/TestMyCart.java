package shopping.cart.exerciseone;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.swing.JFileChooser;

import javazoom.jl.player.advanced.AdvancedPlayer;


public class TestMyCart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBuilder b1 = new Bananas(500,2.0);
		ProductsList l1 = new ProductsList();
		Mail m1 = new Mail();
		l1.addProduct(b1);
		b1 = new StrawBerries(100,5.0);
		l1.addProduct(b1);
		m1.setOffer(true);
		b1 = new Apples(350,3.0);
		m1.setOffer(true);
		l1.addProduct(b1);
		b1 = new Oranges(700,1.0);
		m1.setOffer(true);
		l1.addProduct(b1);
		Transaction t1 = new Transaction(l1);
		m1.setTransaction(true);
		t1.onWork();
		
		boolean statement = true;
		
		int option = 0;
		AdvancedPlayer repro;
		JFileChooser select = new JFileChooser();
		int aux = select.showOpenDialog(null);
		if (aux == JFileChooser.APPROVE_OPTION) {
			File sound = select.getSelectedFile();
			try {
				repro = new AdvancedPlayer(new FileInputStream(sound));	
				repro.play();
				while(statement) {
					Scanner in = new Scanner(System.in);
					System.out.println("Elija una opción: ");
					System.out.println("1- Pause");
					System.out.println("2- Stop");
					System.out.println("3- Play");
					option = in.nextInt();
					switch(option) {
					case 1:
						repro.wait();
						break;
					case 2:
						repro.stop();
						statement = false;
						break;
					case 3:
						repro.play();
						break;
					default:
						System.out.println("Opcion incorrecta");
					}
					
				}
			}
			catch(Exception e) {
				System.out.println("An error ocurred");
			}
		}
		
	}
}
