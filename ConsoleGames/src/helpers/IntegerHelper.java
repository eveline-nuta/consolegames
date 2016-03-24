package helpers;

public final class IntegerHelper
{
	
	public static Boolean isInt(String input)
	{
		try
		{
			Integer.parseInt(input);
			return true;

		}
		catch (NumberFormatException ex)
		{
			return false;
		}
	}
	

	public static Boolean isInsideInterval(String input, int low, int high)
	{
		int number = Integer.parseInt(input);
		if (number > low && number < high )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
