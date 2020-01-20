package userInput;
import java.util.Scanner;

public class SimpleInterest {
//Scanner sc = new Scanner(System.in);
public static void main(String[]args) {
 /*int principal = 5000;
 float rate = 12.5f;
 int time = 12; This is for assign values
 */ 
 
 //Now we will take user input for interest value.
 Scanner sc = new Scanner(System.in);

		 int principal = sc.nextInt();
		 float rate = sc.nextFloat();
		 int time = sc.nextInt();
		 float simpleInterest = principal * rate * time /100;
		//  float simpleInterest = principal * rate * time / 100;
 
	System.out.println("The simple interest is " +simpleInterest);
	
	
}
}
