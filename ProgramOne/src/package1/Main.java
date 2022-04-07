package package1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		
		try {
			FileWriter writer = new FileWriter("log.txt");
			writer.write("Hello "+name);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader("log.txt");
			JTextArea textArea = new JTextArea(5, 10);
			textArea.read(reader, "log.txt");
			JScrollPane scrollPane = new JScrollPane( textArea );
			reader.close();
			JOptionPane.showMessageDialog(null, scrollPane);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
