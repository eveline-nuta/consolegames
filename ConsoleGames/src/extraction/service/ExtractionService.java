package extraction.service;

import java.util.ArrayList;
import java.util.List;

import extraction.model.ExtractionModel;
import extraction.model.LocationModel;

public class ExtractionService
{

	public static ExtractionModel GetFinalExtraction()
	{
		ExtractionModel extractionModel = new ExtractionModel();
		extractionModel = ExtractionHelper.CreateStartingExtractionModel(extractionModel);

		setClovers(extractionModel);
		setValues(extractionModel);

		return extractionModel;

	}

	private static void setValues(ExtractionModel extractionModel)
	{
		List<Integer> valueList = new ArrayList<Integer>();
		valueList = ExtractionHelper.getRandomNumbers();

		for (int position = 0; position < 35; position++)
		{
			extractionModel.getLocations().get(position).setValue(valueList.get(position));
		}
	}

	private static void setClovers(ExtractionModel extractionModel)
	{
		List<Boolean> cloverList = new ArrayList<Boolean>();
		cloverList = ExtractionHelper.CreateClovers();

		for (int position = 0; position < 30; position++)
		{
			extractionModel.getLocations().get(position + 5).setLucky(cloverList.get(position));
			
		}
	}
}
