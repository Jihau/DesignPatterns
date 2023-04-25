package command;

public class TestScreen {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command liftCommand = new LiftScreenCommand(screen);
        Command lowerCommand = new LowerScreenCommand(screen);
        WallButton buttonUp = new WallButton(liftCommand, lowerCommand);
        WallButton buttonDown = new WallButton(lowerCommand, liftCommand);

        buttonUp.pushUp(); // näytön tulisi nousta ylös
        buttonUp.pushDown(); // näytön tulisi laskea alas
        buttonDown.pushDown(); // näytön tulisi laskea alas
        buttonDown.pushUp(); // näytön tulisi nousta ylös
    }
}
