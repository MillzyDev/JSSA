package dev.MillzyG.JSSA;

public class PlayerInfo {
    public String playerId;
    public String playerName;
    public String avatar;
    public int rank;
    public int countryRank;
    public float pp;
    public String country;
    public String role;
    public String[] badges;
    public String history;
    public int permissions;
    public int inactive;
    public int banned;

    PlayerInfo(
            String _playerId,
            String _playerName,
            String _avatar,
            int _rank,
            int _countryRank,
            float _pp,
            String _country,
            String _role,
            String[] _badges,
            String _history,
            int _permissions,
            int _inactive,
            int _banned
    ) {
        playerId = _playerId;
        playerName = _playerName;
        avatar = _avatar;
        rank = _rank;
        countryRank = _countryRank;
        pp = _pp;
        country = _country;
        role = _role;
        badges = _badges;
        history = _history;
        permissions = _permissions;
        inactive = _inactive;
        banned = _banned;
    }
}
