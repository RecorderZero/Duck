package DUCK;
import QUACK.*;
import FLY.*;

public class MallarDuck extends Duck
{
	public MallarDuck(FlyBehavior newf,QuackBehavior newq)
	{
		super(newf,newq);
	}
	public void Display()
	{
		System.out.println("I am MallarDuck");
		super.performFly();
		super.performQuack();
		super.swim();
		System.out.println();
	}
}