package command;

public class LiftScreenCommand implements Command {
    Screen screen;

    public LiftScreenCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.up();
    }
}
