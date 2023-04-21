package com.predrag.game.model;

public class GameResults {

    private int playerAWins;
    private int playerBWins;
    private int draws;
    private int roundsCounter;

    public GameResults(int playerBlueWins, int playerRedWins, int draws, int roundsCounter) {
        this.playerAWins = playerBlueWins;
        this.playerBWins = playerRedWins;
        this.draws = draws;
        this.roundsCounter = roundsCounter;
    }

    public int getPlayerAWins() {
        return playerAWins;
    }

    public int getPlayerBWins() {
        return playerBWins;
    }

    public int getDraws() {
        return draws;
    }

    public int getRoundsCounter() {
        return roundsCounter;
    }
}
