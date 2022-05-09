package dev.Millzy.JSSA.api.players;

import dev.Millzy.JSSA.api.other.Metadata;

public class PlayerCollection {
    private Player[] players;
    private Metadata metadata;

    public Player[] getPlayers() {
        return players;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
