import javax.swing.JFrame;
import javax.swing.*;
public class Calculator extends JFrame {

	public static void main(String[] args) {
		Calculator obj =new Calculator();
		obj.setVisible(true);

	}
	public Calculator() {
		setTitle("Calculator_Java");
		setSize(340,350);
		PennelofCal panel=new PennelofCal();
		this.add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

}
