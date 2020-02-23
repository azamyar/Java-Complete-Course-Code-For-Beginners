package objectOrientedProgramming;
//Code by Syed Azam Yar

//Making method and calling method.

public class Introduction {
	public static void main (String[]args) {
		int firstNumber = 35;
		int secondNumber = 22;
		int result = maxOf(firstNumber,secondNumber);
		System.out.println(result);
		
	}
	static int maxOf(int a , int b) {  // using method
		if (a > b) {                      // static int  maxOf(int a , int b) {
			return a;                               // return a>b ? a:b;             		                                        
			                                 //               }
		}
		else {
			return b;
		}
	}
	
}