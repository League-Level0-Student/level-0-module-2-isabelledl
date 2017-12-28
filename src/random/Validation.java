//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(11);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		
		if (randomNumber==0){JOptionPane.showMessageDialog(null, "");
		
		}
	if (randomNumber==1){JOptionPane.showMessageDialog(null, "1");
	
}	if (randomNumber==2){JOptionPane.showMessageDialog(null, "2");
}
if (randomNumber==3){JOptionPane.showMessageDialog(null, "3");
}

if (randomNumber==4){JOptionPane.showMessageDialog(null, "4");
}
if (randomNumber==5){JOptionPane.showMessageDialog(null, "5");
}
if (randomNumber==6){JOptionPane.showMessageDialog(null, "6");
}

if (randomNumber==7){JOptionPane.showMessageDialog(null, "7");

}
if (randomNumber==8){JOptionPane.showMessageDialog(null, "8");
}

if (randomNumber==9){JOptionPane.showMessageDialog(null, "9");
}
if (randomNumber==10){JOptionPane.showMessageDialog(null, "10");
}
	}



	

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	



}