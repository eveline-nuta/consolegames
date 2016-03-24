package input;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import helpers.DoubleHelper;
import helpers.IntegerHelper;

import java.util.*;

public final class BetInput
{
	public static BetModel Read()
	{

		try
		{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

			double moneyAmount = getValidatedDouble(bufferRead);

			System.out.println("Insert 6 numbers: ");
			List<Integer> list = new ArrayList<Integer>();

			list.add(0, getValidatedInteger(bufferRead));
			list.add(1, getValidatedInteger(bufferRead));
			list.add(2, getValidatedInteger(bufferRead));
			list.add(3, getValidatedInteger(bufferRead));
			list.add(4, getValidatedInteger(bufferRead));
			list.add(5, getValidatedInteger(bufferRead));

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

	private static Integer getValidatedInteger(BufferedReader bufferRead)throws IOException
	{
		
		Boolean isValid = false;
		String input = " ";
		
		System.out.println("Insert a number: ");
		while (!isValid)
			
		{
			input = bufferRead.readLine();
			isValid = IntegerHelper.isInt(input);

			if (!isValid)
			{
				System.out.println("This is not a number ");
				continue;
			}
			isValid = IntegerHelper.isInsideInterval(input,0,49);
			if (!isValid)
			{
				System.out.println("The amount of money must be between 0 and 49");
				continue;
			}
		}		
		return Integer.parseInt(input);
	}

	private static double getValidatedDouble(BufferedReader bufferRead) throws IOException
	{
		double moneyAmount;
		Boolean isValid = false;
		String input = " ";
		while (!isValid)
		{
			System.out.println("Insert amount of money : ");
			input = bufferRead.readLine();
			isValid = DoubleHelper.isDouble(input);

			if (!isValid)
			{
				System.out.println("This is not a number ");
				continue;
			}
			isValid = DoubleHelper.isGreaterThanZero(input);
			if (!isValid)
			{
				System.out.println("The amount of money must be greater than zero ");
				continue;
			}
		}
		moneyAmount = Double.parseDouble(input);
		return moneyAmount;
	}

}
