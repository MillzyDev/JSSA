package dev.Millzy.JSSA.handlers;

public class PlayersHandler {
    private static PlayersHandler INSTANCE;

    private PlayersHandler() {
    }

    public static PlayersHandler getInstance() {
        if (INSTANCE == null)
            INSTANCE = new PlayersHandler();

        return INSTANCE;
    }


}
