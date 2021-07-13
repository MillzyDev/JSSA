package dev.millzyg.jssa;

public class JSSA {
    public Players Players;
    public Requests Requests;

    /**
     * Main JSSA class
     * @since v0.1.0
     */
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
