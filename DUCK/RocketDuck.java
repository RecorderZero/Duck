package DUCK;
import QUACK.*;
import FLY.*;

public class RocketDuck extends Duck
{
	public RocketDuck(FlyBehavior newf,QuackBehavior newq)
	{
		super(newf,newq);
	}
	public void Display()
	{
		System.out.println("I am RocketDuck");
		super.performFly();
		super.performQuack();
		super.swim();
		System.out.println();
	}
}