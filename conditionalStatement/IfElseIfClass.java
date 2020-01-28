package conditionalStatement;
//Code by Syed Azam Yar

public class IfElseIfClass {
	public static void main(String[]args) {
		int number = 27;
		if (number <= 10) {
			System.out.println("Number is less than 10"); // && is basically checking the conditions and this is logical operators 
		} else if (number > 10 && number <= 20) {
			System.out.println("Number is greater than 10 and less than 20");
		} else if(number >20 && number <= 35) {
			System.out.println("Number is greater than 20 and less than 35");
			
		}
	}
}
