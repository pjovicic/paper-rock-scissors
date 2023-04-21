package com.predrag.game.service.strategy;

public class GameStrategyFactory implements MoveGameStrategyFactory {

    private static GameStrategyFactory instance;

    public static GameStrategyFactory getInstance() {
        if (instance == null) {
            instance = new GameStrategyFactory();
        }
        return instance;
    }

    @Override
    public GameStrategy createPaperGameStrategy() {
        return new PaperGameStrategy();
    }

    @Override
    public GameStrategy createRockGameStrategy() {
        return new RockGameStrategy();
    }

    @Override
    public GameStrategy createScissorsGameStrategy() {
        return new ScissorsGameStrategy();
    }
}
