package dev.MillzyG.JSSA;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Players extends Base {
    /**
     *  Searches for a single player based on ID given
     * @param id The Player's ID is used to search for the player
     * @return A Player Object containing all the data received
     * @throws IOException
     */
    public Player GetPlayer(String id) throws IOException { // Gets Score Saber player from provided ID
        String sURL = baseURL + "/api/player/" + id + "/full";

        //URL url = new URL(sURL);
        //URLConnection request = url.openConnection();
        //request.connect();

        String curlCommand = "curl -X GET " + sURL;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process = processBuilder.start();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(process.getInputStream())).getAsJsonObject();
        return new Player(jsonObject);
    }

    /**
     * Searches for players
     * @param name
     * @return
     * @throws IOException
     */
    public ArrayList<SimplePlayer> SearchPlayers(String name) throws IOException {
        String sURL = baseURL + "/api/players/by-name/" + name;

        //URL url = new URL(sURL);
        //URLConnection request = url.openConnection();
        //request.connect();

        String curlCommand = "curl -X GET " + sURL;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process = processBuilder.start();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(process.getInputStream())).getAsJsonObject();
        JsonArray jsonArray = jsonObject.get("players").getAsJsonArray();

        ArrayList<SimplePlayer> players = new ArrayList<SimplePlayer>();
        for (JsonElement player : jsonArray) {
            players.add(new SimplePlayer((JsonObject) player));
        }

        return players;
    }
}
