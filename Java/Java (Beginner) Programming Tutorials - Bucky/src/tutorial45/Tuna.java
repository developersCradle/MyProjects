package tutorial45;

public enum Tuna {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iWish", "16");

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
