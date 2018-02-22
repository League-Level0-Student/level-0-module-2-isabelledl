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
		if (starsing.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by the Sun.\n" + 
					"Generous, organized, protective, beautiful.");
	}
		if (starsing.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Mercury.\n" + 
					"Particular, logical, practical, sense of duty, critical.");
	}
		if (starsing.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Venus.\n" + 
					"Balanced, seeks beauty, sense of justice.");
	}
		if (starsing.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Pluto\n" + 
					"Passionate, exacting, loves extremes, combative, reflective.scopio");
				
	}
		if (starsing.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Saturn.\n" + 
					"Timeless, driven, calculating, ambitious.");
	}
		if (starsing.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Uranus.\n" + 
					"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
	}
		if (starsing.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Neptune.\n" + 
					"Likeable, energetic, passionate, sensitive.");					
	}
}	
}	