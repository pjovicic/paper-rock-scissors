package com.predrag.game.service.move;

import com.predrag.game.service.strategy.MoveGameStrategyFactory;

public class MoveFactory {

    private MoveGameStrategyFactory moveGameStrategyFactory;

    public MoveFactory(MoveGameStrategyFactory moveGameStrategyFactory) {
        this.moveGameStrategyFactory = moveGameStrategyFactory;
    }

    public Move createPaperMove() {
        return new PaperMove(moveGameStrategyFactory.createPaperGameStrategy());
    }

    public Move createRockMove() {
        return new RockMove(moveGameStrategyFactory.createRockGameStrategy());
    }

    public Move createScissorsMove() {
        return new ScissorsMove(moveGameStrategyFactory.createScissorsGameStrategy());
    }
}
