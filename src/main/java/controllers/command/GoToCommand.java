package main.java.controllers.command;

import main.java.model.Presentation;

public class GoToCommand extends PresentCommand implements Command
{

    public GoToCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object obj)
    {
        int pageNumber = Integer.parseInt((String) obj) - 1;
        if (pageNumber > this.presentation.getSize())
        {
            this.presentation.setSlideNumber(this.presentation.getSize()-1);
            return;
        }
        if (pageNumber < 0)
        {
            this.presentation.setSlideNumber(0);
            return;
        }

        this.presentation.setSlideNumber(pageNumber);
    }
}