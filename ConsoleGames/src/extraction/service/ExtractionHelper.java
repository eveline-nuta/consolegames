package extraction.service;

import java.util.ArrayList;
import java.util.List;

import extraction.model.ExtractionModel;
import extraction.model.LocationModel;
import java.util.Collections;

public final class ExtractionHelper
{

	public static List<Integer> getRandomNumbers()
	{
		// Long list of 48 elements:
		List<Integer> longList = new ArrayList<Integer>();
		for (int position = 1; position <= 48; position++)
		{
			longList.add(position);
		}

		// Shuffle List:
		Collections.shuffle(longList);

		// Cut list of 48 and get a short list of 35 elements:
		List<Integer> shortList = new ArrayList<Integer>();
		shortList = longList.subList(0, 35);
		return shortList;

	}

	public static ExtractionModel CreateStartingExtractionModel(ExtractionModel extractionModelToBeFilled)
	{

		SetLocationsFrom0To4(extractionModelToBeFilled);
		SetLocationsFrom5To14(extractionModelToBeFilled);
		SetLocationsFrom15To21(extractionModelToBeFilled);
		SetLocationsFrom22To25(extractionModelToBeFilled);
		SetLocationsFrom26To34(extractionModelToBeFilled);

		return extractionModelToBeFilled;
	}

	private static void SetLocationsFrom26To34(ExtractionModel extractionModelToBeFilled)
	{
		int thirdAward = 9;
		for (int position = 26; position < 35; position++)
		{
			LocationModel locationToBeAdded = new LocationModel(0, thirdAward, false);
			extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
			thirdAward = thirdAward - 1;
		}
	}

	private static void SetLocationsFrom22To25(ExtractionModel extractionModelToBeFilled)
	{
		int secondAward = 25;
		for (int position = 22; position < 26; position++)
		{
			LocationModel locationToBeAdded = new LocationModel(0, secondAward, false);
			extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
			secondAward = secondAward - 5;
		}
	}

	private static void SetLocationsFrom15To21(ExtractionModel extractionModelToBeFilled)
	{
		int award = 90;
		for (int position = 15; position < 22; position++)
		{
			LocationModel locationToBeAdded = new LocationModel(0, award, false);
			extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
			award = award - 10;
		}
	}

	private static void SetLocationsFrom5To14(ExtractionModel extractionModelToBeFilled)
	{
		for (int position = 5; position < 15; position++)
		{
			switch (position)
			{
				case 5:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 10000, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 6:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 7500, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 7:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 5000, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 8:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 2500, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 9:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 1000, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 10:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 500, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 11:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 300, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 12:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 200, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 13:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 150, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
				case 14:
				{
					LocationModel locationToBeAdded = new LocationModel(0, 100, false);
					extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
					break;
				}
			}
		}
	}

	private static void SetLocationsFrom0To4(ExtractionModel extractionModelToBeFilled)
	{
		for (int position = 0; position <= 4; position++)
		{
			LocationModel locationToBeAdded = new LocationModel(0, 0, false);
			extractionModelToBeFilled.getLocations().add(position, locationToBeAdded);
		}
	}
}
