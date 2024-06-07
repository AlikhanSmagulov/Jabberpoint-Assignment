package main.java.controllers.command;

import main.java.model.Presentation;

import java.io.IOException;

public class OpenCommand extends AccessorCommand
{
    private static final int SLIDESETTER = 0;

    public OpenCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object name)
    {
        try {
            this.presentation.clear();
            this.xmlAccessor.loadFile(this.presentation, (String) name);
            this.presentation.setSlideNumber(SLIDESETTER);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}