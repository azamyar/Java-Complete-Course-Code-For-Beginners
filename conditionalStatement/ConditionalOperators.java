package conditionalStatement;
//import java.util.Scanner;
//
//public class ConditionalOperators {
//	public static void main(String[]args) {
//		Scanner sc = new Scanner (System.in);
//		
//		/* Conditional Operators
//          ==
//          !=
//          >
//          <
//          >=
//          <=
//          if (condition) {
//          block of code to be executed if the condition is true.
//          		}
//	*/
////		int noOfPetals = 6;
////		if (noOfPetals % 2==0) {
////			System.out.println("He loves me not");
////		}
////		else {
////			System.out.println("He loves me");
////			}
////	       }
////          }
//		int noOfPetals = sc.nextInt();
//             if (noOfPetals % 2==0) {
//            	 System.out.println("He loves me");
//            }
//             else {
//            	 System.out.println("He loves me not");
//             }
//	}
//	}
import java.util.Scanner;
public class ConditionalOperators {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		double marksStudent = sc.nextDouble();
		if (marksStudent >60) { // If marks greater than 60 so student will be pass otherwise not
			System.out.println("Student is Pass");
		}
		else {
			System.out.println("Student is fail");
		}
	}
}