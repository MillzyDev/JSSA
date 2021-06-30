package dev.MillzyG.JSSA;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class Player { // Player Class
    /**
     * Player Info containing ID, Username, Avatar, Country...etc.
     */
    public PlayerInfo playerInfo;
    /**
     * Score Stats containing accuracy, scores...etc.
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
