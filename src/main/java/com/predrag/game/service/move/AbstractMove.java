package com.predrag.game.service.move;

import com.predrag.game.model.Result;
import com.predrag.game.service.strategy.GameStrategy;

public abstract class AbstractMove implements Move {

    private GameStrategy gameStrategy;

    public AbstractMove(GameStrategy gameStrategy) {
        setGameStrategy(gameStrategy);
    }

    @Override
    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    @Override
    public GameStrategy getGameStrategy() {
        return gameStrategy;
    }

    @Override
    public Result playAgainst(Move move) {
        return getGameStrategy().play(move);
    }
}
