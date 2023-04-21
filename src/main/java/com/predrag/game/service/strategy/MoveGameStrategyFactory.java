package com.predrag.game.service.strategy;

public interface MoveGameStrategyFactory {

    GameStrategy createPaperGameStrategy();

    GameStrategy createRockGameStrategy();

    GameStrategy createScissorsGameStrategy();

}
