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
	public  void Print()
	{
		System.out.print("Value "+ " "+"Award"+ " " +"  Lucky" );
		System.out.println(" ");
		
		for(LocationModel element:getLocations())
		{
		  /*try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}*/
			element.Print();
		}
		
	}

}
