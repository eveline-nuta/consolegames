package check;

import java.util.ArrayList;
import java.util.List;

import extraction.model.ExtractionModel;
import extraction.model.LocationModel;
import input.BetModel;

public final class Checker
{

	public static List<LocationModel> Check(ExtractionModel finalExtraction, BetModel input)
	{
		List <LocationModel> winningNumbers=new ArrayList<LocationModel>();
		
		
		for (int chosenNumber : input.getList())
		{
			for (LocationModel element : finalExtraction.getLocations())
			{
					if(chosenNumber== element.getValue())
					{
						winningNumbers.add(element);
						break;
					}
			}
		}
		
		return winningNumbers;
	}
}
