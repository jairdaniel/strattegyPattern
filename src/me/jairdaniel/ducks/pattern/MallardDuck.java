package me.jairdaniel.ducks.pattern;

import me.jairdaniel.ducks.pattern.fly.FlyWithWings;
import me.jairdaniel.ducks.pattern.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackable = new Quack();
		flyable = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I am a Mallard duck");

	}

}
