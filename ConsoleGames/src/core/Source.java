package core;

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
		extractionModel=ExtractionHelper.CreateStartingExtractionModel(extractionModel);

	}

}
