package main.java.model.factory;

import main.java.model.items.BitmapItem;
import main.java.model.items.SlideItem;

public class BitmapItemFactory implements SlideItemFactory
{
    @Override
    public SlideItem createSlideItem(int level, String s)
    {
        return new BitmapItem(level, s);
    }
}

