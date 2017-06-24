package me.jairdaniel.ducks.pattern;

import me.jairdaniel.ducks.pattern.fly.Flyable;
import me.jairdaniel.ducks.pattern.quack.Quackable;

public class SimpleDuck extends Duck {

	private String displayValue;
	
	public SimpleDuck(String displayValue) {
		this.displayValue = displayValue;
	}
	
	public SimpleDuck(String displayValue, Flyable flyable, Quackable quackable) {
		this.displayValue = displayValue;
		this.flyable = flyable;
		this.quackable = quackable;
	}
	
	@Override
	public void display() {
		System.out.println(displayValue);
	}

	public void setFlyBehavior(Flyable flyable){
		this.flyable = flyable;
	}
	
	public void setQuackBehavior(Quackable quackable){
		this.quackable = quackable;
	}
	
}
