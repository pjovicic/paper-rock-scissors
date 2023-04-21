package com.predrag.game.model;

public class Game {

    private Player playerA;
    private Player playerB;
    private GameResults gameResults;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public GameResults getGameResults() {
        return gameResults;
    }

    public void setGameResults(GameResults gameResults) {
        this.gameResults = gameResults;
    }
}
