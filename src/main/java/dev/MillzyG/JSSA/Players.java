package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Players extends Base {
    /**
     *
     * @param id The Player's ID is used to search for the player
     * @return A Player Object containing all the data received
     * @throws IOException
     */
    public Player GetPlayer(String id) throws IOException { // Gets Score Saber player from provided ID
        String sURL = baseURL + "/api/player/" + id + "/full";

        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();
        return new Player(jsonObject);
    }
}
