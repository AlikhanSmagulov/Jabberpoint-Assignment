package main.java.controllers.command;


import main.java.model.Presentation;

public class AddNewCommand extends PresentCommand implements Command
{
    public AddNewCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object obj)
    {
        this.presentation.clear();
    }
}
