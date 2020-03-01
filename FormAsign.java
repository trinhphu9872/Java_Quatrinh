import javax.swing.JFrame;
import javax.swing.*;
public class FormAsign extends JFrame {

	public static void main(String[] args) {
		FormAsign obj=new FormAsign();
		obj.setVisible(true);

	}
	public FormAsign() {
		setTitle("+_+--Form đăng kí thông tin cá nhân+_+--");
		setSize(355, 585);
		FormPanel Pan=new FormPanel();
		this.add(Pan);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

}
