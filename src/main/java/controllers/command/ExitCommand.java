package main.java.controllers.command;

import main.java.model.Presentation;

public class ExitCommand extends PresentCommand implements Command
{
    private static final int EXITSTATUS = 0;

    public ExitCommand(Presentation presentation)
    {
        super(presentation);
    }

    @Override
    public void execute(Object obj)
    {
        this.presentation.exit(EXITSTATUS);
    }

    public static void execute()
    {
    }
}
