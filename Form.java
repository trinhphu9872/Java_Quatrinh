import javax.swing.JFrame;
import javax.swing.*;
public class Form extends JFrame {

	public static void main(String[] args) {
		Form obj=new Form();
		obj.setVisible(true);
	}
	public Form() {
	     setSize(1000,1000 );
	     setTitle("  +_+----Form đăng kí----+_+   ");
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	     
	     panel panel=new panel();
	     this.add(panel);
	     setLocationRelativeTo(null);
	}

}
