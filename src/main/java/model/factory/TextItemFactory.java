package main.java.model.factory;

import main.java.model.items.SlideItem;
import main.java.model.items.TextItem;

public class TextItemFactory implements SlideItemFactory
{
    @Override
    public SlideItem createSlideItem(int level, String s)
    {
        return new TextItem(level, s);
    }
}

