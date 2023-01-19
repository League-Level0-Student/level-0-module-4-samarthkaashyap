package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String input1 = JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int input5 = Integer.parseInt(input1);
		// Ask the user how many dimes they have, and convert their answer
String input2 = JOptionPane.showInputDialog("How many dimes do you have?");
int input10 = Integer.parseInt(input2);
		// Ask the user how many quarters they have, and convert their answer
String input3 = JOptionPane.showInputDialog("How many quarters do you have?");
int input25 = Integer.parseInt(input3);
		// Calculate how much money the user has.  Hint: Use a double variable 
double value = input5 * 0.05 + input10 * 0.1 + input25 * 0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "You have $ " + value);
	}
}

