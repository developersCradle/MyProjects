package tutorial_152_collection_overview;

import java.util.*;

public class Theatre {
	private final String theaterName;
	private List<Seat> seats = new ArrayList<>();

	
	public Theatre(String theaterName, int numRows, int seatsPerRow) {
		this.theaterName = theaterName;
		
		int lastRow = 'A' + (numRows - 1);
		
		for (char row = 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++)
			{
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seats);
			}
		}
	}


	public String getTheaterName() {
		return theaterName;
	}
	
	
	
	public boolean reserverSeat(String seatNumber)
	{
		Seat requestSeat = null; 
		for(Seat seat : seats)
		{
			if (condition) { //08:00
				
			}
		}
	}
}
