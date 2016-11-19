package DUCK;
import QUACK.*;
import FLY.*;

public abstract class Duck
{
	private QuackBehavior q;
	private FlyBehavior f;

	public Duck(FlyBehavior newf,QuackBehavior newq)
	{
		setFlyBehavior(newf);
		setQuackBehavior(newq);
	}
	public void swim()
	{
		System.out.println("swimmming");
	}
	public void performFly()
	{
		f.fly();
	}

	public void performQuack()
	{
		q.quack();
	}
	public void setFlyBehavior(FlyBehavior newf)
	{
		f = newf;
	}
	public void setQuackBehavior(QuackBehavior newq)
	{
		q = newq;
	}
	public abstract void Display();
}