package com.predrag.game.service.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GameStrategyFactoryTest {

    private static GameStrategyFactory gameStrategyFactory;

    @BeforeAll
    static void setup() {
        gameStrategyFactory = GameStrategyFactory.getInstance();
    }

    @Test
    void testCreatePaperGameStrategy() {
        GameStrategy result = gameStrategyFactory.createPaperGameStrategy();
        assert (result instanceof PaperGameStrategy);
    }

    @Test
    void testCreateRockGameStrategy() {
        GameStrategy result = gameStrategyFactory.createRockGameStrategy();
        assert (result instanceof RockGameStrategy);
    }

    @Test
    void testCreateScissorsGameStrategy() {
        GameStrategy result = gameStrategyFactory.createScissorsGameStrategy();
        assert (result instanceof ScissorsGameStrategy);
    }
}
