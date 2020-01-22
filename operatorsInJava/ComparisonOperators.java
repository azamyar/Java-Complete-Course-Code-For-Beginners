package operatorsInJava;

public class ComparisonOperators {
	public static void main(String[]args) {
	int a = 3;
	int b = 7;
	int c = 7;
	int d = 3;
	int e = 4;
	int f = 4;
	System.out.println(a > b); // false because a is small number.
	System.out.println(c > d); // true because c is large number.
	System.out.println(e <= f); // true because both are equal
	System.out.println(f <= e); // also true
	// =  is assignment operatos and == is equal number
	int g =5;
	int h =5;
	int i =6;
	int j =7;
	System.out.println(g==h);
	System.out.println(i!=j); // not equal means false because both numbers are not same.
	}
}
