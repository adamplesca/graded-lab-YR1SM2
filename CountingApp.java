// Graded lab week 10
// Adam Plesca
// 31/3/23

import javax.swing.JOptionPane;

public class CountingApp{
	 public static void main(String args[]){
		 String input, redo;
		 int vowels, spaces, numbers;

		 Counting myCounting = new Counting();

		 input = JOptionPane.showInputDialog(null,"Enter a sentence");
		 myCounting.setInput(input);

		 myCounting.compute();

		 vowels = myCounting.getVowels();
		 spaces = myCounting.getSpaces();
		 numbers = myCounting.getNumbers();

		 JOptionPane.showMessageDialog(null,"There are "+vowels+" vowels in that sentence"+"\n There are " + spaces + " spaces in that sentence"+ numbers +"\n There are "+ numbers +" numbers in that sentence");

		 redo = JOptionPane.showInputDialog(null,"Would you like to enter another sentence? \n Type Yes if you do \n Type No if you'd like to leave");

		 if(redo.equalsIgnoreCase("Yes")){
			 redo = JOptionPane.showInputDialog(null,"Enter another sentence");
			 myCounting.setInput(redo);
			 myCounting.compute();
			 vowels = myCounting.getVowels();
			 spaces = myCounting.getSpaces();
			 numbers = myCounting.getNumbers();
			 JOptionPane.showMessageDialog(null,"There are "+vowels+" vowels in that sentence"+"\n There are " + spaces + " spaces in that sentence"+ numbers +"\n There are "+ numbers +" numbers in that sentence");
		 }
		 else if(redo.equalsIgnoreCase("No")){
			 JOptionPane.showMessageDialog(null, "Have a nice day!");
		 }else{
			 JOptionPane.showMessageDialog(null, "You really couldn't follow a simple instruction :/");
		 }
 	}
}

