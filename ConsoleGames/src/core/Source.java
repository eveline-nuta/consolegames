package core;

import java.util.ArrayList;
import java.util.List;
import extraction.model.ExtractionModel;
import extraction.model.LocationModel;
import extraction.service.ExtractionHelper;
import extraction.service.ExtractionService;
import input.BetInput;
import input.BetModel;
import check.Checker;
public class Source
{

	public static void main(String[] args)
	{

	BetModel model = BetInput.Read();
		
		ExtractionModel extractionModel = new ExtractionModel();
		//extractionModel = ExtractionHelper.CreateStartingExtractionModel(extractionModel);
		extractionModel=ExtractionService.GetFinalExtraction();
		//extractionModel.Print();
		
		List<LocationModel>winningResult=new ArrayList<LocationModel>();
		
		winningResult=Checker.Check(extractionModel,model);
		
		//List<Integer> testList = new ArrayList<Integer>();
		//testList = ExtractionHelper.getRandomNumbers();
	}

}
