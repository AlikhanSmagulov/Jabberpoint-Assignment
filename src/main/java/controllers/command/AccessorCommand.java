package main.java.controllers.command;

import main.java.accessor.XMLAccessor;
import main.java.model.Presentation;

public abstract class AccessorCommand implements Command
{
    protected XMLAccessor xmlAccessor;
    protected Presentation presentation;

    public AccessorCommand(Presentation presentation)
    {
        this.presentation = presentation;
        this.xmlAccessor = new XMLAccessor();
    }

}
