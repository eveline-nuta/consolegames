package extraction.model;

import java.util.*;

public class ExtractionModel
{

	private List<LocationModel> locations;

	public ExtractionModel()
	{
		setLocations(new ArrayList<LocationModel>());
	}

	public List<LocationModel> getLocations()
	{
		return locations;
	}

	public void setLocations(List<LocationModel> locations)
	{
		this.locations = locations;
	}

}
