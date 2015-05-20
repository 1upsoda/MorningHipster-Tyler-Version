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
	/**
	 * sets the frame for the panel to go in
	 */
	private HipsterFrame baseFrame;
	/**
	 * sets the hipster so info can be added to it
	 */
	private Hipster myHipster;
	/**
	 * starts the frame and the hipster with name tyler and age 17
	 */
	public HipsterAppController()
	{
		
		myHipster= new Hipster("Tyler", 17);
		createAlbumArray();
		baseFrame = new HipsterFrame(this);
		
	}
	/**
	 * returns the info held inside hipster
	 * @return
	 */
	public Hipster getMyHipster()
	{
		return myHipster;
	}
	/**
	 * creates an album array with these titles
	 */
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
