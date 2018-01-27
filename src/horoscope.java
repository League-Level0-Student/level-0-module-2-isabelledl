import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String starsing = JOptionPane.showInputDialog("what is your star sing? ");
		if (starsing.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Mars.\n"
					+ "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");

		}
		if (starsing.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Venus.\n"
					+ "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");

		}if (starsing.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Mercury\n" + 
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}if (starsing.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "A water sign; ruled by the Moon.\n" + 
				"Emotional, group oriented, seeks security, family.");
}
}	
}	