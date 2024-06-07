package main.java.controllers.command;

import main.java.model.Presentation;

import java.io.IOException;

public class SaveCommand extends AccessorCommand
{
    public SaveCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object name)
    {
        try {
            this.xmlAccessor.saveFile(this.presentation, (String) name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
