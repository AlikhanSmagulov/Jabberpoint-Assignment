package main.java.model.factory;

import main.java.model.items.SlideItem;

public interface SlideItemFactory
{
    SlideItem createSlideItem(int level, String s);
}
