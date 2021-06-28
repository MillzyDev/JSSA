package dev.MillzyG.JSSA;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Player {
    public PlayerInfo playerInfo;
    public ScoreStats scoreStats;

    Player(String id) throws IOException {
        String sURL = "https://new.scoresaber.com/api/player/" + id + "/full";

        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();

        Gson converter = new Gson(); // Gson object for type conversion

        /**
         * CONSTRUCT PLAYERINFO
         */

        JsonObject playerInfoObj = jsonObject.getAsJsonObject("playerInfo");
        playerInfo = new PlayerInfo(
                playerInfoObj.get("playerId").getAsString(),
                playerInfoObj.get("playerName").getAsString(),
                playerInfoObj.get("avatar").getAsString(),
                playerInfoObj.get("rank").getAsInt(),
                playerInfoObj.get("countryRank").getAsInt(),
                playerInfoObj.get("pp").getAsFloat(),
                playerInfoObj.get("country").getAsString(),
                playerInfoObj.get("role").isJsonNull() ? null : playerInfoObj.get("role").getAsString(),
                converter.fromJson(playerInfoObj.get("badges"), String[].class),
                playerInfoObj.get("history").getAsString(),
                playerInfoObj.get("permissions").getAsInt(),
                playerInfoObj.get("inactive").getAsInt(),
                playerInfoObj.get("banned").getAsInt()
        );

        /**
         * CONSTRUCT SCORESTATS
         */

        JsonObject scoreStatsObj = jsonObject.getAsJsonObject("scoreStats");
        scoreStats = new ScoreStats(
                scoreStatsObj.get("totalScore").getAsInt(),
                scoreStatsObj.get("totalRankedScore").getAsInt(),
                scoreStatsObj.get("averageRankedAccuracy").getAsFloat(),
                scoreStatsObj.get("totalPlayCount").getAsInt(),
                scoreStatsObj.get("rankedPlayCount").getAsInt()
        );
    }
}
