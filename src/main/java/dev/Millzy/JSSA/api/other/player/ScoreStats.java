package dev.Millzy.JSSA.api.other.player;

public class ScoreStats {
    private int totalScore;
    private int totalRankedScore;
    private float averageRankedAccuracy;
    private int totalPlayCount;
    private int rankedPlayCount;
    private int replaysWatched;

    public int getTotalScore() {
        return totalScore;
    }

    public int getTotalRankedScore() {
        return totalRankedScore;
    }

    public float getAverageRankedAccuracy() {
        return averageRankedAccuracy;
    }

    public int getTotalPlayCount() {
        return totalPlayCount;
    }

    public int getRankedPlayCount() {
        return rankedPlayCount;
    }

    public int getReplaysWatched() {
        return replaysWatched;
    }
}
