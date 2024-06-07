package main.java.model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;
import main.java.model.factory.SlideItemFactory;
import main.java.model.factory.TextItemFactory;
import main.java.model.items.SlideItem;
import main.java.model.Style;


import javax.swing.*;


/** <p>A slide. This class has a drawing functionality.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class Slide
{
	public final static int WIDTH = 1200;
	public final static int HEIGHT = 800;
	protected String title; // title is saved separately
	protected Vector<SlideItem> items; // slide items are saved in a Vector

	private SlideItemFactory textItemFactory;
	private SlideItemFactory BitmapItemFactory;

	public Slide()
	{
		this.title = "";
		this.items = new Vector<SlideItem>();
		this.textItemFactory = new TextItemFactory();
	}

	// Add a slide item
	public void addSlideItem(SlideItem anItem)
	{
		this.items.addElement(anItem);
	}

	// give the title of the slide
	public String getTitle()
	{
		return this.title;
	}

	// change the title of the slide
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}

	// Create TextItem of String, and add the TextItem
	public void addTextItem(int level, String message)
	{
		this.addSlideItem(this.textItemFactory.createSlideItem(level, message));
	}

	public void addBitmapItem(int level, String message)
	{
		this.addSlideItem(this.BitmapItemFactory.createSlideItem(level, message));
	}


	public SlideItem getSlideItem(int number)
	{
		return this.items.elementAt(number);
	}

	// give all SlideItems in a Vector
	public Vector<SlideItem> getSlideItems()
	{
		return this.items;
	}

	// give the size of the Slide
	public int getSize()
	{
		return this.items.size();
	}

	// draw the slide
	public void draw(Graphics g, Rectangle area, ImageObserver view)
	{
		float scale = getScale(area);
		int y = area.y;
		// Title is handled separately
		SlideItem slideItem = this.textItemFactory.createSlideItem(0, getTitle());
		Style style = Style.getStyle(slideItem.getLevel());
		slideItem.draw(area.x, y, scale, g, style, view);
		y += slideItem.getBoundingBox(g, view, scale, style).height;
		for (int number=0; number<getSize(); number++) {
			slideItem = (SlideItem)getSlideItems().elementAt(number);
			style = Style.getStyle(slideItem.getLevel());
			slideItem.draw(area.x, y, scale, g, style, view);
			y += slideItem.getBoundingBox(g, view, scale, style).height;
		}
	}

	// Give the scale for drawing
	public float getScale(Rectangle area)
	{
		return Math.min(((float)area.width) / ((float)WIDTH), ((float)area.height) / ((float)HEIGHT));
	}

	public void display()
	{
	}
}