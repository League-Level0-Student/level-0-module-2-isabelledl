import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age= JOptionPane.showInputDialog("How old are you?");
	int number =Integer.parseInt(age);
	if (number< 18) {JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	
	}else {JOptionPane.showInputDialog(" Who do you want to be the next president?");
	
	}
}
}
