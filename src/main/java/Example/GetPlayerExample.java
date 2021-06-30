package Example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.MillzyG.JSSA.JSSA;

import java.io.IOException;

public class GetPlayerExample {
    public static void GetPlayer() throws IOException {
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String endersId = "76561198076657570";

        String playerJson = converter.toJson(jssa.Players.GetPlayer(endersId));

        System.out.println(playerJson);
    }
}
