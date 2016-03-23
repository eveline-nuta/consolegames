package output;



public final class Output
{
	public static void Print(double result)
	{
		if (result == 0)
		{
			System.out.println("Sorry, you lost.... :( ");
			System.out.println("Try again, you're bound to get it right next time :) ");
		}
		else
		{
			System.out.println("Congrats, the sum you won consists in " + result + " :) ");
		}
	}
}
