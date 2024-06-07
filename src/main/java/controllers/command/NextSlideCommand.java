package main.java.controllers.command;

import main.java.model.Presentation;

public class NextSlideCommand extends PresentCommand implements Command
{

    public NextSlideCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object obj)
    {
        this.presentation.nextSlide();
    }
}
