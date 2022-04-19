package mypackage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame{

	public Frame(){
		ImageIcon catImage = new ImageIcon("cat.jpg");
		
		JLabel catLabel = new JLabel();
		catLabel.setText("Cat");
		catLabel.setIcon(catImage);
		catLabel.setHorizontalTextPosition(JLabel.CENTER);
		catLabel.setVerticalTextPosition(JLabel.TOP);
		catLabel.setForeground(Color.black);
		catLabel.setFont(new Font("Comic Sans",Font.PLAIN,20));
		catLabel.setIconTextGap(-30);
		catLabel.setVerticalAlignment(JLabel.CENTER);
		catLabel.setHorizontalAlignment(JLabel.CENTER);
		catLabel.setVisible(false);
		
		JButton catButton = new JButton();
		catButton.setBounds(650,0,100,50);
		catButton.addActionListener(e -> catLabel.setVisible(true));
		catButton.setText("Cat");
		catButton.setFocusable(false);
		catButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
		catButton.setForeground(Color.LIGHT_GRAY);
		catButton.setBackground(Color.DARK_GRAY);
		catButton.setBorder(BorderFactory.createEtchedBorder());
		
		JPanel thePanel = new JPanel();
		thePanel.setBounds(0,0,650,570);
		
		this.setSize(850, 750);
		this.setTitle("Click button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(catLabel);
		this.add(thePanel);
		thePanel.add(catLabel);
		this.add(catButton);
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png");
		this.setIconImage(logo.getImage());
		this.getContentPane().setBackground(new Color(0x123456));
	}
}