package loop.controller;

import java.util.ArrayList;

import loop.model.Looper;
import loop.view.LoopFrame;
/**
 * Controller for the Loop Project
 * @author Mikel North
 * @version 1.0 11/5/13 basic setup
 */
public class LoopController
{
// 	Declaration section	
	private LoopFrame appFrame;
	private Looper myLooper;
	private int clickCount;
	
	public LoopController()
	{
		myLooper = new Looper();
		clickCount = 0;
	}
	
	public void start()
	{
		appFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String results = "";
		
		results =  loopBackwardOverList();
		
		return results;
	}
	
	public Looper getMyLooper()
	{
		
		return myLooper;
	}
	
	private String getListResults(int position)
	{
		String currentResult = "";
		
//		ArrayList<String> tempList = myLooper.getGraveNameList();
//		currentResult = tempList.get(position);
		if(position < myLooper.getGraveNameList().size())
		{
			
		currentResult = myLooper.getGraveNameList().get(position);
		}
		return currentResult;
	}
	
	private String loopBackwardOverList()
	{
		String results = "";
		
		for(int position = myLooper.getGraveNameList().size() - 1; position >= 0; position--)
		{
			results += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return results;
	}
	
	private String loopOverList()
	{
		String results = "";
		
		for(int position = 0; position<myLooper.getGraveNameList().size(); position++)
		{
			results += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return results;
	}


}
