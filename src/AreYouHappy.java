import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy");
		String yes = null;
		String no = null;
		if (happy.equals("no")) {
			yes = JOptionPane.showInputDialog("Do you want to be happy?");
		}
			if (happy.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Keep dping whatever you'er doing");

			}

		
		if (yes.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}

		if (yes.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you'er doing");

		}
		
	}

}
