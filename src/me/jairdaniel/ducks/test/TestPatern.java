package me.jairdaniel.ducks.test;

import me.jairdaniel.ducks.pattern.Duck;
import me.jairdaniel.ducks.pattern.MallardDuck;
import me.jairdaniel.ducks.pattern.SimpleDuck;
import me.jairdaniel.ducks.pattern.fly.FlyWithRocket;
import me.jairdaniel.ducks.pattern.quack.Mute;

public class TestPatern {

	public static void main(String[] args) {
		testDuck(new MallardDuck());
		testDuck(new SimpleDuck("I am made on the fly!", new FlyWithRocket(), new Mute()));
	}
	
	public static void testDuck(Duck duck){
		duck.display();
		duck.quack();
		duck.fly();
	}
}
