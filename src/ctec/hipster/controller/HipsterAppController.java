package src.ctec.hipster.controller;

import src.ctec.hipster.model.Hipster;
import src.ctec.hipster.view.HipsterFrame;

/**
 * HipsterAppCobtroller for the 2014 Hipster project.
 * @author Cody Henrichsen (Tyler Parsons added)
 * @version 1.1 11/14/14 added the picture, the drop down list and stuff.
 */
public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster myHipster;
	
	public HipsterAppController()
	{
		
		myHipster= new Hipster("Tyler", 17);
		createAlbumArray();
		baseFrame = new HipsterFrame(this);
		
	}
	
	public Hipster getMyHipster()
	{
		return myHipster;
	}
	
	private void createAlbumArray()
	{
		String [] tempHipster = myHipster.getHipsterAlbums();
		tempHipster [0] = "Iron and Wine: something";
		tempHipster [1] = "Isaac loves me.";
		tempHipster [2] = "Ventripicul";
		tempHipster [3] = "Tolocide";
		myHipster.setHipsterAlbums(tempHipster);
		
	}
	
	public void start()
	{
		
	}
}
