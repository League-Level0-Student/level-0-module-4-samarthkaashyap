package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Double_Test_Scores {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "What did you get on your test?");
double x = Double.parseDouble(input);
if (x<=50) {
	System.out.println("Study Harder");
}
if (x>50) {
	System.out.println("Good Job");
}
	
	
	
	
	} 

}
