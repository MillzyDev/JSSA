package dev.millzyg.jssa;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Requests extends Base {
    /**
     * Fetches the top requests from the leaderboard
     * @since 0.4.0
     * @return A list of SimplePlayer Objects from the top of the leaderboard
     * @throws IOException
     */
    public ArrayList<SimpleRequest> getTopRequests() throws IOException {
        String sURL = baseURL + "/api/ranking/requests/top";

        //URL url = new URL(sURl);
        //URLConnection request = url.openConnection();
        //request.connect();

        String curlCommand = "curl -X GET " + sURL;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process = processBuilder.start();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(process.getInputStream())).getAsJsonObject();
        JsonArray jsonArray = jsonObject.get("requests").getAsJsonArray();

        ArrayList<SimpleRequest> out = new ArrayList<SimpleRequest>();

        for (JsonElement jsonElement : jsonArray) {
            SimpleRequest simpleRequest = new SimpleRequest(jsonElement.getAsJsonObject());
            out.add(simpleRequest);
        }

        return out;
    }

    /**
     * Fetches requests that are not top of the leaderboard
     * @since v0.4.0
     * @return
     * @throws IOException
     */
    public ArrayList<SimpleRequest> getBelowTopRequests() throws IOException {
        String sURL = baseURL + "/api/ranking/requests/belowTop";

        //URL url = new URL(sURl);
        //URLConnection request = url.openConnection();
        //request.connect();

        String curlCommand = "curl -X GET " + sURL;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process = processBuilder.start();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(process.getInputStream())).getAsJsonObject();
        JsonArray jsonArray = jsonObject.get("requests").getAsJsonArray();

        ArrayList<SimpleRequest> out = new ArrayList<SimpleRequest>();

        for (JsonElement jsonElement : jsonArray) {
            SimpleRequest simpleRequest = new SimpleRequest(jsonElement.getAsJsonObject());
            out.add(simpleRequest);
        }

        return out;
    }

    /**
     * Searches for a single request based on request number given.
     * @param req request number
     * @return Returns matching request
     * @throws IOException
     * @since v0.3.0
     */
    public Request getRequest(String req) throws IOException {
        String sURL = baseURL + "/api/ranking/request/" + req;

        //URL url = new URL(sURl);
        //URLConnection request = url.openConnection();
        //request.connect();

        String curlCommand = "curl -X GET " + sURL;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process = processBuilder.start();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(process.getInputStream())).getAsJsonObject();
        return new Request(jsonObject);
    }
}
