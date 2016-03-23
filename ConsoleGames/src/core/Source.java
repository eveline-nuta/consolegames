package core;

import java.util.ArrayList;
import java.util.List;

import calculation.Calculator;
import extraction.model.ExtractionModel;
import extraction.model.LocationModel;
import extraction.service.ExtractionHelper;
import extraction.service.ExtractionService;
import input.BetInput;
import input.BetModel;
import output.Output;
import check.Checker;

public class Source
{

	public static void main(String[] args)
	{

		BetModel model = BetInput.Read();

		ExtractionModel extractionModel = new ExtractionModel();
		
		extractionModel = ExtractionService.GetFinalExtraction();
		extractionModel.Print();

		List<LocationModel> winningResult = new ArrayList<LocationModel>();

		winningResult = Checker.Check(extractionModel, model);
		double wonSum=Calculator.CalculateResult(winningResult, model);
		Output.Print(wonSum);

	}

}
