import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?");
	int number =Integer.parseInt(height);
	if (number< 49) {JOptionPane.showMessageDialog(null, "You need to grow a bit more");
		
	}else {JOptionPane.showMessageDialog(null, "You may ride the rollercoaster!");
		
	
	}
}
}
