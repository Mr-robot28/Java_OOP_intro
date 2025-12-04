package com.calling;

import com.object.Animal;

public class Animal_called {
	public static void main(String[] args) {
		Animal animal = new Animal();

		String name1 = animal.name = "tommy";
		String type1 = animal.type = "Dog";
		int age1 = animal.age = 3;
		String color1 = animal.color = "Brown";
		boolean isWild1 = animal.isWild = false;

		System.out.println("Animal Name: " + animal.name);
		System.out.println("Animal Type: " + animal.type);
		System.out.println("Age: " + animal.age);
		System.out.println("Color: " + animal.color);
		System.out.println("Is Wild: " + animal.isWild);

	}

}
