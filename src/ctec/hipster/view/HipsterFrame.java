package src.ctec.hipster.view;

import javax.swing.JFrame;

import src.ctec.hipster.controller.HipsterAppController;

public class HipsterFrame extends JFrame
{
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 600);
		this.setResizable(false);
		this.setVisible(true);
	}

}
