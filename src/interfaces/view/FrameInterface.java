package interfaces.view;

import interfaces.controller.IntController;

import javax.swing.JFrame;

public class FrameInterface extends JFrame
{
	private InterfacePanel appPanel;
	
	public FrameInterface(IntController baseController)
	{
		appPanel = new InterfacePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(700, 400);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
