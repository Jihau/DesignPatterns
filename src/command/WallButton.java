package command;

public class WallButton {
    Command upCommand;
    Command downCommand;

    public WallButton(Command up, Command down) {
        this.upCommand = up;
        this.downCommand = down;
    }

    public void pushUp() {
        upCommand.execute();
    }

    public void pushDown() {
        downCommand.execute();
    }
}
