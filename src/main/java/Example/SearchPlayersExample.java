package Example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.MillzyG.JSSA.JSSA;

import java.io.IOException;

public class SearchPlayersExample {
    public static void SearchPlayers() throws IOException {
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String search = "Tempex";

        String playersJson = converter.toJson(jssa.Players.SearchPlayers(search));

        System.out.println(playersJson);
    }
}
