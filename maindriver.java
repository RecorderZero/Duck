import DUCK.*;
import FLY.*;
import QUACK.*;

public class maindriver
{
	public static void main(String[] args)
	{
		Duck A_Duck = new DecoyDuck( new FlyNoWay(), new MuteQuack() );
		Duck B_Duck = new RubberDuck( new FlyNoWay(), new Squack() );
		Duck C_Duck = new RedHeadDuck( new FlyWithWings(), new Quack() );
		Duck D_Duck = new MallarDuck( new FlyWithWings(), new Quack() );
		Duck R_Duck = new RocketDuck( new FlyWithRocket(), new Quack() );
		A_Duck.Display();
		B_Duck.Display();
		C_Duck.Display();
		D_Duck.Display();
		R_Duck.Display();
	}
}