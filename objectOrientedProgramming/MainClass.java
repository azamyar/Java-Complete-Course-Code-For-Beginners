package objectOrientedProgramming;

class Cat {
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	public void walk (){ //Behavior 
	System.out.println("Cat is walking");
	}
	public void eat() {
		
    System.out.println("Cat is eating");
	}
	public void Description () {  //State 
		System.out.println("The cat has " + legs + " Legs and " + eyes +" Eyes");
	}
}
class Dog {
	String breed,name,biscuits,saturday;
	public void jump() {
		System.out.println("My dog is "+ name + " It's breed is " +breed);
	}
	public void eat() {
		System.out.println("My dog eat is " +biscuits +" daily and Taking bath every "+ saturday);
	}
		
}
public class MainClass {
	public static void main (String []args) {
		
	Cat cat1 = new Cat(); // object
	Cat cat2 = new Cat(); // object
	cat1.legs =3; 
	cat1.eyes =2;
	cat2.legs = 4;
	cat2.eyes = 4;
	cat1.Description(); //call function
	cat2.Description();			//call function
	
	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	
    dog1.breed ="Husky";
    dog1.name = "Taison";
    dog2.breed = "german";
    dog2.name = "Chintu";
    dog1.biscuits = "3 Checky ";
    dog1.saturday = "Saturday";
    dog2.biscuits ="4 checky";
    dog2.saturday ="Saturday";
	dog1.jump();
	dog1.eat();
	dog2.jump();
	dog2.eat();
	}
}