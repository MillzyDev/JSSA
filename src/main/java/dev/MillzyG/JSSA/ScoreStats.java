package dev.MillzyG.JSSA;

public class ScoreStats {
    public int totalScore;
    public int totalRankedScore;
    public float averageRankedAccuracy;
    public int totalPlayCount;
    public int rankedPlayCount;

    ScoreStats(
            int _totalScore,
            int _totalRankedScore,
            float _averageRankedAccuracy,
            int _totalPlayCount,
            int _rankedPlayCount
    ) {
        totalScore = _totalScore;
        totalRankedScore = _totalRankedScore;
        averageRankedAccuracy = _averageRankedAccuracy;
        totalPlayCount = _totalPlayCount;
        rankedPlayCount = _rankedPlayCount;
    }
}
