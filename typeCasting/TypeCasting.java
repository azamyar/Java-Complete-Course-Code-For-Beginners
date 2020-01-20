package typeCasting;

public class TypeCasting {
	public static void main (String []args) {
		
		//Automatic Type Casting
	/*	int x =2;
		double y = x;
		System.out.println(x);
		System.out.println(y);

		//Manual Type Casting
         double myDouble = 2.4567;
         int myInt = (int)myDouble;
         System.out.println(myDouble);
         System.out.println(myInt)
         */
		//Automatic Narrowing and Manual Widening
         int intValue = 4;
         double doubleValue = intValue;
         double myDoubleValue = 20.3456;
         int myInt = (int)myDoubleValue;
         System.out.println(intValue);
         System.out.println(doubleValue);
         System.out.println(myDoubleValue);
         System.out.println(myInt);
         }
}