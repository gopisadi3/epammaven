package mavenexample;

import java.util.*;

public class Gifts {
	List<Candy> candies;

	Gifts() {
		candies = new ArrayList<Candy>();
	}
     //adding candies to list
	public void addCandy(Candy candy) throws NullPointerException {
		if (candy != null)
			candies.add(candy);
		else
			throw new NullPointerException();
	}
    //no of candies
	public int getNumberOfCandies() throws NullPointerException {
		if (candies != null)
			return candies.size();
		else
			throw new NullPointerException();
	}

	public List<Candy> getAllCandies() throws NullPointerException {
		if (candies != null)
			return candies;
		else
			throw new NullPointerException();
	}
}
