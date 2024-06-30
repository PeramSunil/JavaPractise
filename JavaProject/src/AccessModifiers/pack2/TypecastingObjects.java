package AccessModifiers.pack2;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


public class TypecastingObjects {

	public static void main(String[] args) {
		
		
		//Rule 1: conversion is valid or no.
		// Type of an and (Cat) must have some relationship(either parent to child or child to parent).
		
		//Animal an=new Dog();
		//Cat ct=(Cat)an;// Valid as per Rule 1,Rule 2. In Valid as per Rule 3
		// Dog and Cat should be same or should have some relation ship as per Rule 3
		
		//Dog dg=new Dog();
		//Cat ct=(Cat)dg;// As per Rule 1 this is not valid because we not find any relation ship between Dog and Cat.
		
		// Rule 2--Assignment is valid or not.
		// (Cat) should be same or Child of Cat. 
		
	//Cat ct=(Dog) an;// Valid as per Rule 1 and Invalid as per Rule 2.
		// Rule 3--The underlying object type of 'd' must be either same or child of 'C'.
		
		// As per Rules 1,2 and 3 this is correct.
		
		Animal an=new Dog();
		Dog dg=(Dog)an;
		
		
		

	}

}
