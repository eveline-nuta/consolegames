package input;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.*;

public final class BetInput
{

	public static BetModel Read()
	{
		System.out.println("Insert amount of money : ");
		try
		{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

			double moneyAmount = Double.parseDouble(bufferRead.readLine());
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
