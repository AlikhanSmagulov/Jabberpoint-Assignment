package main.java.controllers.command;

import main.java.model.Presentation;

public class PrevSlideCommand extends PresentCommand implements Command
{


    public PrevSlideCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object obj)
    {
        this.presentation.prevSlide();
    }
}
