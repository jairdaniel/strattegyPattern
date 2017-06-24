package me.jairdaniel.ducks.test;

import me.jairdaniel.ducks.inheritance.DecoyDuck;
import me.jairdaniel.ducks.inheritance.Duck;
import me.jairdaniel.ducks.inheritance.MallardDuck;
import me.jairdaniel.ducks.inheritance.RubberDuck;

public class TestInheritance {
	public static void main(String[] args) {
		
		testDuck(new MallardDuck());

		testDuck(new RubberDuck());
		
		testDuck(new DecoyDuck());
		
		
		
	}
	
	public static void testDuck(Duck duck){
		duck.display();
		duck.quack();
	}

}
