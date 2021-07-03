package dev.MillzyG.JSSA;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Requests extends Base {
    public ArrayList<SimpleRequest> GetTopRequests() throws IOException {
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

    public ArrayList<SimpleRequest> GetBelowTopRequests() throws IOException {
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
     */
    public Request GetRequest(String req) throws IOException {
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
