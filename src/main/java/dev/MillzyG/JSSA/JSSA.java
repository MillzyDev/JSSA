package dev.MillzyG.JSSA;

public class JSSA {
    public Players Players;
    public Requests Requests;

    public JSSA() {
        /**
         * Players section of Score Saber's API
         */
        this.Players = new Players();

        /**
         * Requests/Songs section of Score Saber's API
         */
        this.Requests = new Requests();
    }
}
