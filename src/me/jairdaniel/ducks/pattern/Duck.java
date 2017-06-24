package me.jairdaniel.ducks.pattern;

import me.jairdaniel.ducks.pattern.fly.Flyable;
import me.jairdaniel.ducks.pattern.quack.Quackable;

public abstract class Duck {
	protected Quackable quackable;
	protected Flyable flyable;
	
	public abstract void display();
	
	public void swim(){
		System.out.println("Every duck swims");
	}
	
	public void quack(){
		quackable.quack();
	}
	
	public void fly(){
		flyable.fly();
	}
}
