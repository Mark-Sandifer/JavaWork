package mypackage;

import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener{
	
	static JLabel label;
	static JTextField myField;
	static JButton buttonF2C;
	static JButton buttonC2F;
	static JFrame frame;
	
	Main()
	{	
	}
	
	public static void main(String[] args) {
		
		Main te = new Main();
		
		buttonF2C = new JButton("Convert C to F");
		buttonF2C.addActionListener(te);
		
		buttonC2F = new JButton("Convert F to C");
		buttonC2F.addActionListener(te);
		
		label = new JLabel("");
		JLabel labelDesc = new JLabel("Input temp to convert");
		
		myField = new JTextField(9);
		
		JPanel panel = new JPanel();
		
		frame = new JFrame("text");
		frame.setTitle("Temperature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(550,450);
		frame.add(panel);
		
		panel.add(labelDesc);
		panel.add(myField);
		panel.add(buttonF2C);
		panel.add(buttonC2F);
		panel.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		if (input.equals("Convert C to F")) {
			var read = myField.getText();
			int toInt = Integer.parseInt(read);
			double result = (toInt - 32) * 0.556;
			int fToC = (int)result;
			String c = String.valueOf(fToC);
			
			label.setText(c);
			myField.setText("");
		} else if (input.equals("Convert F to C")) {
			var read = myField.getText();
			int toInt = Integer.parseInt(read);
			double result = (toInt * 1.8) + 32;
			int cToF = (int)result;
			String c = String.valueOf(cToF);
			
			label.setText(c);
			myField.setText("");
		}
		
	}

}
