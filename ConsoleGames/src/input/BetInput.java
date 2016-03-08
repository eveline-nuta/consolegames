package input;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.*;

public final class BetInput
{

/*	private static double getDoubleInput(BufferedReader bufferRead)
	{
		double result = 2.0;
		try
		{
			String text = " ";
			do
			{
				System.out.println("Insert amount of money : ");
				text = bufferRead.readLine();
			}
			while (validateInput(text) == false);
			result = Double.parseDouble(text);

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return result;
	}

	private static Boolean validateInput(String text)
	{
		if(text.isEmpty())
		{
			return false;
		}
		char[] charArray = text.toCharArray();
		for(int counter = 0 ; counter < charArray.length ; counter++)
		{
			if(!Character.isDigit(charArray[counter]))
			{
				return false;
			}
		}
		return true;
	}*/

	public static BetModel Read()
	{

		try
		{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

			//double moneyAmount = getDoubleInput(bufferRead);
			
			System.out.println("Insert amount of money : ");
			double moneyAmount=Double.parseDouble(bufferRead.readLine());
			
			System.out.println("Insert 6 numbers: ");
			List<Integer> list = new ArrayList<Integer>();

			list.add(0, Integer.parseInt(bufferRead.readLine()));
			list.add(1, Integer.parseInt(bufferRead.readLine()));
			list.add(2, Integer.parseInt(bufferRead.readLine()));
			list.add(3, Integer.parseInt(bufferRead.readLine()));
			list.add(4, Integer.parseInt(bufferRead.readLine()));
			list.add(5, Integer.parseInt(bufferRead.readLine()));

			BetModel model = new BetModel(moneyAmount, list);
			return model;

		}

		catch (IOException ex)
		{
			ex.printStackTrace();
			BetModel model = new BetModel();
			return model;
		}

	}
}
