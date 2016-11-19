package DUCK;
import QUACK.*;
import FLY.*;

public class RubberDuck extends Duck
{
	public RubberDuck(FlyBehavior newf,QuackBehavior newq)
	{
		super(newf,newq);
	}	
	public void Display()
	{
		System.out.println("I am RubberDock");
		super.performFly();
		super.performQuack();
		super.swim();
		System.out.println();
	}
}