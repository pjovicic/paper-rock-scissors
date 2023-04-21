package com.predrag.game.model;

import com.predrag.game.service.move.Move;

public class Player {

    private Move move;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }
}
