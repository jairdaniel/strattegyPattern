package me.jairdaniel.ducks.inheritance;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a rubber duck");

	}
	
	@Override
	public void quack(){
		System.out.println("I squeak");
	}

}
