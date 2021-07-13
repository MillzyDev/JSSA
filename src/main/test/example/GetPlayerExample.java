package example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.millzyg.jssa.JSSA;

import java.io.IOException;

public class GetPlayerExample {
    public static void GetPlayer() throws IOException {
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String id = "76561198075009026";

        String playerJson = converter.toJson(
                jssa.Players.getPlayer(id)
        );

        System.out.println(playerJson);
    }
}
