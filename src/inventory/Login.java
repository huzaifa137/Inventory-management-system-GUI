package inventory;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame {

		Login()
		{
			
			JLabel label = new JLabel();
			label.setForeground(Color.blue);
			ImageIcon image1 = new ImageIcon("LOGO.png");
			label.setIcon(image1);
			label.setText("COMPANY SALES MANAGEMENT SYSTEM");
			label.setVerticalTextPosition(JLabel.TOP);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalAlignment(JLabel.CENTER);
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setFont(new Font("Times New Roman",Font.PLAIN,20));
			label.setIconTextGap(12);
			label.setBounds(300, 300, 300, 300);
			
			
			
			this.setSize(600, 6000);
			this.getContentPane().setBackground(Color.cyan);
			this.setTitle("Login Panel");
			this.setLayout(null);
			ImageIcon image = new ImageIcon("LOGO.png");
			this.setIconImage(image.getImage());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			this.add(label);
		}
}
