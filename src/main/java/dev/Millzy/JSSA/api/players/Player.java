package dev.Millzy.JSSA.api.players;

import dev.Millzy.JSSA.api.other.player.Badge;
import dev.Millzy.JSSA.api.other.player.ScoreStats;

public class Player {
    private String id;
    private String name;
    private String profilePicture;
    private String country;
    private float pp;
    private int rank;
    private int countryRank;
    private String role;
    private Badge[] badges;
    private String histories;
    private ScoreStats scoreStats;
    private int permissions;
    private boolean banned;
    private boolean inactive;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getCountry() {
        return country;
    }

    public float getPP() {
        return pp;
    }

    public int getRank() {
        return rank;
    }

    public int getCountryRank() {
        return countryRank;
    }

    public String getRole() {
        return role;
    }

    public Badge[] getBadges() {
        return badges;
    }

    public String getHistories() {
        return histories;
    }

    public ScoreStats getScoreStats() {
        return scoreStats;
    }

    public boolean isInactive() {
        return inactive;
    }

    public boolean isBanned() {
        return banned;
    }

}
