package loop.model;

import java.util.ArrayList;

public class Looper
{
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheGraveNameList();
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	private void fillTheGraveNameList()
	{
		graveNameList.add("Orazio Giovanni Chenet");
		graveNameList.add("Alice Alsop & oven Alsop");
		graveNameList.add("Frederic J Haynie & Lori Ann");
		graveNameList.add("Lawrence Frear & Verdonna");
		graveNameList.add("Steven Varsil Bolliger");
		graveNameList.add("Paul s. Westerman");
		graveNameList.add("Leo W. Caldwell");
		graveNameList.add("Shirley s. Caldwell");
		graveNameList.add("Annie Bell Parker");
		
	}
	
	public String loopTestOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;

		for (int counter = 17; counter >= 5; counter -= 2)
		{
			loopResult += counter + ", ";
			numberOfTimes++;
		}

		loopResult += "was the last time.";
		loopResult += "\nThe loop executed " + numberOfTimes + " times.";

		return loopResult;
	}

	public String loopTestTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		for (int week = 0; week < 52; week++)
		{
			for (int day = 0; day < 7; day++)
			{
				for (int other = 0; other < 24; other++)
				{
					for (int count = 0; count < 60; count++)
					{
						// loopResult += "count is" = count + "\n";
						for (int otherCount = 0; otherCount < 60; otherCount++)
						{
							// loopResult += "otherCount is " + otherCount +
							// "\n";
							numberOfTimes++;
						}
					}
				}
			}
		}
		loopResult += "TheLoop executed " + numberOfTimes + " times - wow!";
		return loopResult;
	}
}
