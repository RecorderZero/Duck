package DUCK;
import QUACK.*;
import FLY.*;

public class DecoyDuck extends Duck
{
	public DecoyDuck(FlyBehavior newf,QuackBehavior newq)
	{
		super(newf,newq);
	}
	public void Display()
	{
		System.out.println("I am DecoyDuck");
		super.performFly();
		super.performQuack();
		super.swim();
		System.out.println();
	}
	
}