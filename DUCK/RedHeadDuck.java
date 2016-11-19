package DUCK;
import QUACK.*;
import FLY.*;

public class RedHeadDuck extends Duck
{
	public RedHeadDuck(FlyBehavior newf,QuackBehavior newq)
	{
		super(newf,newq);
	}
	public void Display()
	{
		System.out.println("I am RedHeadDuck");
		super.performFly();
		super.performQuack();
		super.swim();
		System.out.println();
	}
}