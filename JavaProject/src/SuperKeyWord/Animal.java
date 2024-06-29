package SuperKeyWord;

public class Animal {
	String color="White";
	void eat() {
		System.out.println("Parent class Eating..");
	}
	Animal(){
		System.out.println("Parent class Contructor");
	}
	Animal(String name){
		System.out.println("Parent class constructor " + name);
	}
}
	class Dog extends Animal {
		String color="Dog";
		void display() {
			System.out.println("Child class method with parent class value : " + super.color );
			System.out.println("Child class method with class value : " + color );
		}
		void eat() {
			//System.out.println("Child class eating..");
			super.eat();// With this key word we are executing parent class method in child class declaration
		}
		Dog(){
			super();// Here super keyword will be optional. With or without the parent class constructor will be executed.
			System.out.println("Child class Contructor");
		}
		Dog(String name){
			super(name);
			
		}
	}
	
	
	
	


