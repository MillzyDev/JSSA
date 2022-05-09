package dev.Millzy.JSSA.api;

import dev.Millzy.JSSA.handlers.PlayersHandler;

public class JSSA {

    public final PlayersHandler players;

    public JSSA() {
        players = PlayersHandler.getInstance();
    }
}
