package interfaces.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.controller.IntController;

import javax.swing.*;

public class InterfacePanel extends JPanel
{
	private IntController baseController;
	private SpringLayout baseLayout;
	private JButton addGameButton;
	private JButton installButton;
	private JButton startButton;
	private JButton stopButton;
	private JButton rageQuitter;
	private JButton emptyButton;
	
	public InterfacePanel(IntController baseController)
	{
		this.baseController = baseController;
		
		addGameButton = new JButton("Add Game");
		installButton = new JButton("Install Game");
		startButton = new JButton("Start Game");
		stopButton = new JButton("Stop Game");
		rageQuitter = new JButton("Rage Quit!");
		emptyButton = new JButton("Empty Wallet");
		
		
		setupPane();
		setupPanel();
		setupLayout();
		heyListen();
	}
	
	private void setupPane()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, addGameButton, 41, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, addGameButton, -500, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addGameButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, stopButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, stopButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, startButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, startButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, addGameButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rageQuitter, 1, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, startButton, 195, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, stopButton, -323, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, startButton, 375, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, startButton, -200, SpringLayout.EAST, this);
		
	}
	
	private void heyListen()
	{
		addGameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				
			}
		});
		
		installButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				
			}
		});
		
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				
			}
		});
		
		stopButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				
			}
		});
		
		rageQuitter.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				
			}
		});
		
		emptyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				
			}
		});
	}
}