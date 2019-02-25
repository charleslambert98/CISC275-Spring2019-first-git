

import java.util.*;

public class Dog extends Animal {
	
	public Dog(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}

	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Tucker", 4));
		
		System.out.println(dogs);
	}
}
