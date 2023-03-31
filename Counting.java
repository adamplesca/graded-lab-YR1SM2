// Graded lab week 10
// Adam Plesca
// 31/3/23

public class Counting{

	private String input, redo;
	private int vowels, spaces, numbers;

	public Counting(){
	input = " ";
	vowels = 0;
	spaces = 0;
	numbers = 0;
	redo = " ";
	}

	public void setInput(String input){
		this.input = input;
	}
	public void setRedo(String redo){
		this.redo = redo;
	}

	public void compute(){
		input = input.toLowerCase();
		for(int i = 0; i < input.length();i++){
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
				vowels = vowels +1;
			}
			else if(input.charAt(i)==' '){
				spaces = spaces + 1;
			}
			else if(input.charAt(i)=='0'||input.charAt(i)=='1'||input.charAt(i)=='2'||input.charAt(i)=='3'||input.charAt(i)=='4'||input.charAt(i)=='5'||input.charAt(i)=='6'||input.charAt(i)=='7'||input.charAt(i)=='8'||input.charAt(i)=='9'){
				numbers = numbers + 1;
			}
		 }
	}
	public int getVowels(){
		return vowels;
	}
	public int getSpaces(){
		return spaces;
	}
	public int getNumbers(){
		return numbers;
	}
}