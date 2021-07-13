package dev.millzyg.jssa;

import com.google.gson.JsonObject;

import java.io.IOException;

/**
 * Represents a Score Saber Player JSON object
 * @since v0.1.0
 */
public class Player { // Player Class
    /**
     * Represents the PlayerInfo JSON object
     */
    public PlayerInfo playerInfo;

    /**
     * Represents the ScoreStats JSON object
     */
    public ScoreStats scoreStats;

    /**
     * Constructs a new Player Object
     * @param jsonObject A Gson JsonObject is taken as an argument and then gets converted into PlayerInfo and ScoreStats objects.
     * @throws IOException
     */
    Player(JsonObject jsonObject) throws IOException {

        JsonObject playerInfoObj = jsonObject.getAsJsonObject("playerInfo");
        playerInfo = new PlayerInfo(playerInfoObj);

        JsonObject scoreStatsObj = jsonObject.getAsJsonObject("scoreStats");
        scoreStats = new ScoreStats(scoreStatsObj);
    }
}
