package main.java.controllers.command;

import main.java.model.Presentation;

public abstract class PresentCommand
{
    protected Presentation presentation;

    public PresentCommand(Presentation presentation)
    {
        this.presentation = presentation;
    }

}
