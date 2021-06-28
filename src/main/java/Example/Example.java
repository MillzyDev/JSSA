package Example;

import dev.MillzyG.JSSA.JSSA;
import dev.MillzyG.JSSA.Player;
import dev.MillzyG.JSSA.PlayerInfo;
import dev.MillzyG.JSSA.ScoreStats;

import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) throws IOException {
        String endersId = "76561198076657570";

        Player enderdrachelp = JSSA.GetPlayer(endersId);

        PlayerInfo playerInfo = enderdrachelp.playerInfo;
        ScoreStats scoreStats = enderdrachelp.scoreStats;

        /**
         * PRINT VALUES
         */

        System.out.println("PLAYER INFO: ");
        System.out.println("Player ID: " + playerInfo.playerId);
        System.out.println("Player Name: " + playerInfo.playerName);
        System.out.println("Avatar: " + playerInfo.avatar);
        System.out.println("Rank: " + playerInfo.rank);
        System.out.println("Country Rank " + playerInfo.countryRank);
        System.out.println("PP: " + playerInfo.pp);
        System.out.println("Country: " + playerInfo.country);
        System.out.println("Role: " + playerInfo.role);
        System.out.println("Badges: " + Arrays.toString(playerInfo.badges));
        System.out.println("History: " + playerInfo.history);
        System.out.println("Permissions: " + playerInfo.permissions);
        System.out.println("Inactive: " + playerInfo.inactive);
        System.out.println("Banned: " + playerInfo.banned);

        System.out.println("\n\nSCORE STATS: ");
        System.out.println("Total Score: " + scoreStats.totalScore);
        System.out.println("Total Ranked Score: " + scoreStats.totalRankedScore);
        System.out.println("Average Ranked Accuracy: " + scoreStats.averageRankedAccuracy);
        System.out.println("Total Play Count: " + scoreStats.totalPlayCount);
        System.out.println("Ranked Play Count: " + scoreStats.rankedPlayCount);

        // WILL PRINT BELOW
        /**
         * PLAYER INFO:
         * Player ID: 76561198076657570
         * Player Name: EnderdracheLP
         * Avatar: /images/steam.png
         * Rank: 0
         * Country Rank 0
         * PP: 718.999
         * Country: DE
         * Role: null
         * Badges: []
         * History: 999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999,999999
         * Permissions: 0
         * Inactive: 1
         * Banned: 0
         *
         *
         * SCORE STATS:
         * Total Score: 80063860
         * Total Ranked Score: 5522689
         * Average Ranked Accuracy: 90.67695
         * Total Play Count: 168
         * Ranked Play Count: 15
         */
    }
}
