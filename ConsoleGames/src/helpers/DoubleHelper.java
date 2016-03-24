package helpers;

public final class DoubleHelper
{
	public static Boolean isGreaterThanZero(String input)
	{
		if (Double.parseDouble(input) > 0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public static Boolean isDouble(String input)
	{
		try
		{
			Double.parseDouble(input);
			return true;

		}
		catch (NumberFormatException ex)
		{
			return false;
		}
	}
	
	public static Boolean isInsideInterval(String input, double low, double high)
	{
		double number = Double.parseDouble(input);
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
