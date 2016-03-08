package extraction.model;

public class LocationModel
{

	private int value;
	private int award;
	private boolean lucky;

	public LocationModel()
	{

	}

	public LocationModel(int value, int award, boolean lucky)
	{
		this.setAward(award);
		this.setLucky(lucky);
		this.setValue(value);

	}

	public boolean isLucky()
	{
		return lucky;
	}

	public void setLucky(boolean lucky)
	{
		this.lucky = lucky;
	}

	public int getAward()
	{
		return award;
	}

	public void setAward(int award)
	{
		this.award = award;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}
	
	public void Print()
	{
		System.out.print(this.getValue());

		System.out.print("       "+this.getAward());

		System.out.print("       "+this.isLucky());
		
		System.out.println(" ");
		
	}

}
