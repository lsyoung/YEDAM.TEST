package com.yedam.java.ch01;

public class Example {

	public static void main(String[] args) {
		//NullpointerException
		String data = null;
		//System.out.println(data.toString());
		
		//ArrayIndexOutOfBoundsException
		/*
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: "+data1);
		System.out.println("args[1]: "+data2);*/
		 
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: "+data1);
			System.out.println("args[1]: "+data2);
		}else {
			System.out.println("두개의 매개값이 필요합니다.");
		}
		//NumberFormatException
		/*String data1 = "100";
		String data2 = "a2100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1+"+"+data2+"="+result);*/
		
		//ClssCastException
		Dog dog  = new Dog();
		changedog(dog);
		Cat cat = new Cat();
		changedog(cat);
	}
	
	public static void changedog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog) animal;
		}
	}

}
class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}