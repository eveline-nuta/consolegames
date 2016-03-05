package core;

import java.util.ArrayList;
import java.util.List;
import extraction.model.ExtractionModel;
import extraction.service.ExtractionHelper;
import input.BetInput;
import input.BetModel;

public class Source
{

	public static void main(String[] args)
	{

		BetModel model = BetInput.Read();
		ExtractionModel extractionModel = new ExtractionModel();
		extractionModel = ExtractionHelper.CreateStartingExtractionModel(extractionModel);

		List<Integer> testList = new ArrayList<Integer>();
		testList = ExtractionHelper.getRandomNumbers();
	}

}
