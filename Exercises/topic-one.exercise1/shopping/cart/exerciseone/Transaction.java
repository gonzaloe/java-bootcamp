package shopping.cart.exerciseone;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Transaction implements ActionListener {
	private ProductsList transaction;
	private double total;
	private boolean statement;
	JButton b1 = new JButton("Aceptar");
	
	Scanner s1 = new Scanner(System.in);
	
	public Transaction(ProductsList transaction) {
		this.transaction = transaction;
	}
	
	public void onWork() {
		int option = 0;
		String optionSel;
		statement = true;
		while(statement) {
			optionSel = JOptionPane.showInputDialog("Choose an option: \n1- Buy\n2- Offers\n3- Cashout");
			option = Integer.parseInt(optionSel);
			if (option<=3 && option>0) {
			switch(option) {
			case 1:
				buy();
				break;
			case 2:
				InOffer i1 = new InOffer();
				i1.offertsList();
				onWork();
				break;
			case 3:
				checkOut();
				break;
			}
			statement = false;
			}
			else
				JOptionPane.showMessageDialog(null, "Wrong option! Choose again");
		}
	}
	
	public void buy() {
		statement = true;
		int index = 0;
		int qty = 0;
		String optionSel;
		while(statement) {
			optionSel = JOptionPane.showInputDialog(transaction.toString());
			index = Integer.parseInt(optionSel);
			if(index<=transaction.getLength() && index>0) {
				statement = false;
			}
			else
				JOptionPane.showMessageDialog(null, "Wrong option! Choose again");
		}
		statement = true;
		index--;
		while(statement) {
			optionSel = JOptionPane.showInputDialog("Now enter a quantity to purchase \n");
			qty = Integer.parseInt(optionSel);
			if(qty>0 && qty<transaction.getQtyAvailable(index))
				statement = false;
			else
				JOptionPane.showMessageDialog(null, "Wrong option! Enter again");
		}

		this.total += transaction.getSubtotal(index, qty);
		onWork();
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            System.exit(0);
        }
    }
	
	public void checkOut() {
		statement = true;
		int option = 0;
		String optionSel;
		while(statement) {
		optionSel = JOptionPane.showInputDialog("Subtotal is $" + total + "\nChoose a payment method (default cash): \n1- Credit Card\n2- Paypal\n3- Cash");
		option = Integer.parseInt(optionSel);
		if(option<=3 && option>0) {
			switch(option) {
			case 1:
				JFrame j2 = new JFrame();
				j2.setLayout(new FlowLayout());
				JLabel c3 = new JLabel("Write down your name and credit card number : \n");
				JTextField c4 = new JTextField("titular");
				JTextField c5 = new JTextField("credit card number");
				j2.add(c3);
				j2.add(c4);
				j2.add(c5);
				j2.add(b1);
				j2.setSize(300,100);
				j2.setLocation(500,500);
				j2.setVisible(true);
				j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				b1.addActionListener(this);
				TransactionId id1 = new TransactionId();
				total = total - (total*0.1);
				JOptionPane.showMessageDialog(null,"Total with discounts: " + total + "\n Your purchase has been done with the transaction id: " +id1.addCredit());
				break;
			case 2:
				JFrame j1 = new JFrame();
				j1.setLayout(new FlowLayout());
				JLabel c1 = new JLabel("Enter your Paypal account: \n");
				JTextField c2 = new JTextField("username");
				JPasswordField p1 = new JPasswordField("password");
				j1.add(c1);
				j1.add(c2);
				j1.add(p1);
				j1.add(b1);
				j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				j1.setSize(350,100);
				j1.setLocation(500,500);
				j1.setVisible(true);
				b1.addActionListener(this);		
				TransactionId id2 = new TransactionId();
				total = total - transaction.getCheapest();
				JOptionPane.showMessageDialog(null,"Total with discounts: " + total + "\n Your purchase has been done with the transaction id: " +id2.addPaypal());
				break;
			case 3:
				TransactionId id3 = new TransactionId();
				total = total - transaction.getExpensive();
				JOptionPane.showMessageDialog(null,"Total with discounts: " + total + "\n Your purchase has been done with the transaction id: " +id3.addCash());
				break;
			}
			statement = false;
		}
		else
			JOptionPane.showMessageDialog(null, "Wrong option! Choose again");
		}
	
	}
	
	
}
