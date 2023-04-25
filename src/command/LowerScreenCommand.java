package command;

public class LowerScreenCommand implements Command {
    Screen screen;

    public LowerScreenCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.down();
    }
}
