package dev.MillzyG.JSSA;

import java.io.IOException;

public class JSSA {
    public static Player GetPlayer(String id) throws IOException {
        return new Player(id);
    }
}
