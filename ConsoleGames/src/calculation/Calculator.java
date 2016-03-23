package calculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import input.*;
import check.Checker;
import extraction.model.LocationModel;

public final class Calculator
{
	public static int getNumberOfClovers(List<LocationModel> winningNumbers)
	{
		int numberOfClovers = 0;

		for (LocationModel element : winningNumbers)
		{
			if (element.isLucky() == true)
			{
				numberOfClovers++;
			}
		}
		return numberOfClovers + 1;
	}

	private static int getMinimumAward(List<LocationModel> winningNumbers)
	{

		List<Integer> awardList = new ArrayList<Integer>();

		for (LocationModel element : winningNumbers)
		{
			if (element.getAward() != 0)
			{
				awardList.add(element.getAward());
			}
		}
		Integer minimumValue = Collections.min(awardList);
		return minimumValue;
	}

	public static double CalculateResult(List<LocationModel> winningNumbers, BetModel model)
	{

		double wonSum = 0;
		if (winningNumbers.size() == 6)
		{
			int award = getMinimumAward(winningNumbers);
			double moneyAmount = model.getMoneyAmount();

			wonSum = moneyAmount * award * getNumberOfClovers(winningNumbers);

		}

		return wonSum;

	}

}
