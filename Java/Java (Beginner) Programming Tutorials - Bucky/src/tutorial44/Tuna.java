package tutorial44;

public enum Tuna {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12");

	private final String desc;
	private final String year;
	
	Tuna(String description, String birhday)
	{
		desc = description;
		year = birhday;
	}
	
	public String getDescription()
	{
		return desc;
	}
	
	public String getYear()
	{
		return year;
	}
}
