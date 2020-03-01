import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class PennelofCal extends JPanel {
	double one,two;
	String phep;
	String ket;
	double qua;
	public void paint(Graphics g) {
		
		this.setLayout(null);
		
		int width = 60;
		int height = 55;
		JButton so1 = new JButton("1");
		so1.setBounds(0, 50, width, height);
		JButton so2 = new JButton("2");
		so2.setBounds(66, 50, width, height);
		JButton so3 = new JButton("3");
		so3.setBounds(130, 50, width, height);
		JButton so4 = new JButton("4");
		so4.setBounds(0, 110, width, height);
		JButton so5 = new JButton("5");
		so5.setBounds(66, 110, width, height);
		JButton so6 = new JButton("6");
		so6.setBounds(130, 110, width, height);
		JButton so7 = new JButton("7");
		so7.setBounds(0, 170, width, height);
		JButton delete=new JButton("Delete");
		delete.setBounds(0, 230, width, height);
		JButton so8 = new JButton("8");
		so8.setBounds(66, 170, width, height);
		JButton so9 = new JButton("9");
		so9.setBounds(130, 170, width, height);
		JButton so0 = new JButton("0");
		so0.setBounds(66, 230, width, height);
		JButton daucong = new JButton("+");
		daucong.setBounds(196, 50, width, height);
		JButton dautru = new JButton("-");
		dautru.setBounds(196, 110, width, height);
		JButton daunhan = new JButton("*");
		daunhan.setBounds(196, 170, width, height);
		JButton dauchia = new JButton("/");
		dauchia.setBounds(196, 230, width, height);
		JButton daubang = new JButton("=");
		daubang.setBounds(270, 50, 58, 260);
		JTextField text = new JTextField();
		text.setBounds(-10, -5, 340, 58);
		
		add(delete);
		add(so0);
		add(so1);
		add(so2);
		add(so3);
		add(so4);
		add(so5);
		add(so6);
		add(so7);
		add(so8);
		add(so9);
		add(dautru);
		add(daunhan);
		add(daucong);
		add(dauchia);
		add(daubang);
		add(text);
		daubang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ket;
				two=Double.parseDouble(text.getText());
				if (phep=="+") {
					qua=one+two;
					 ket=String.format("%.2f", qua);
					 text.setText(ket);
				}
				else if (phep=="-") {
					qua=one-two;
					ket=String.format("%.2f", qua);
					 text.setText(ket);
				}else if (phep=="*") {
					qua=one*two;
					ket=String.format("%.2f", qua);
					 text.setText(ket);
				}else if (phep=="/") {
					qua=one/two;
					ket=String.format("%.2f", qua);
					 text.setText(ket);
				}
				
				
			}
		});
		
		ActionListener listen = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == so1) {
					text.setText(text.getText() + so1.getText());
				} else if (e.getSource() == so2) {
					text.setText(text.getText() + so2.getText());
				} else if (e.getSource() == so3) {
					text.setText(text.getText() + so3.getText());
				} else if (e.getSource() == so4) {
					text.setText(text.getText() + so4.getText());
				} else if (e.getSource() == so5) {
					text.setText(text.getText() + so5.getText());
				} else if (e.getSource() == so6) {
					text.setText(text.getText() + so6.getText());
				} else if (e.getSource() == so7) {
					text.setText(text.getText() + so7.getText());
				} else if (e.getSource() == so8) {
					text.setText(text.getText() + so8.getText());
				} else if (e.getSource() == so9) {
					text.setText(text.getText() + so9.getText());
				} else if (e.getSource() == so0) {
					text.setText(text.getText() + so0.getText());
				} else if (e.getSource() == daucong) {
					one=Double.parseDouble(text.getText());
					text.setText("");
				    phep="+";
				} else if (e.getSource() == dautru) {
					one=Double.parseDouble(text.getText());
					text.setText("");	
					phep="-";
				} else if (e.getSource() == daunhan) {
					one=Double.parseDouble(text.getText());
					text.setText("");
					phep="*";
				} else if (e.getSource() == dauchia) {
					one=Double.parseDouble(text.getText());
					text.setText("");
					phep="/";
				}else if(e.getSource()==delete) {
					text.setText(null);
				}
			}
		};
		super.paint(g);
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		so1.addActionListener(listen);
		so2.addActionListener(listen);
		so3.addActionListener(listen);
		so4.addActionListener(listen);
		so5.addActionListener(listen);
		so6.addActionListener(listen);
		so7.addActionListener(listen);
		so8.addActionListener(listen);
		so9.addActionListener(listen);
		so0.addActionListener(listen);
		dauchia.addActionListener(listen);
		daucong.addActionListener(listen);
		daunhan.addActionListener(listen);
		dautru.addActionListener(listen);
		delete.addActionListener(listen);
	}

}
