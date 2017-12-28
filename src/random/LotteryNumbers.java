package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	int random =0;
	int random1 =0;
	int random2 =0;
	int random3=0;
	int random4 =0;
	

	Random dan= new Random();
	random =dan .nextInt(100);
	random1 =dan .nextInt(100);
	random2 =dan .nextInt(100);
	random3=dan .nextInt(100);
	random4 =dan .nextInt(100);
String results= "Your results are " + random+", " +random1+", " + random2+", "+ random3+", " + random4+", " ; 
JOptionPane.showMessageDialog(null,results);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
