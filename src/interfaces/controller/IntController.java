package interfaces.controller;

import interfaces.view.FrameInterface;

public class IntController
{
	private FrameInterface appFrame;
	
	public IntController()
	{
		appFrame = new FrameInterface(this);
	}
	
	public FrameInterface getAppFrame()
	{
		return appFrame;
	}
	
	public void setAppFrame(
			FrameInterface appFrame)
	{
		this.appFrame = appFrame;
	}
	
	public void start()
	{
		
	}
}
