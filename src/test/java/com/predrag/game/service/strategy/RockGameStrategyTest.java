package com.predrag.game.service.strategy;

import com.predrag.game.model.Result;
import com.predrag.game.service.move.MoveFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockGameStrategyTest {

    private static GameStrategyFactory gameStrategyFactory;
    private static MoveFactory moveFactory;

    @BeforeAll
    static void setup() {
        gameStrategyFactory = GameStrategyFactory.getInstance();
        moveFactory = new MoveFactory(gameStrategyFactory);
    }

    @Test
    void testPlayScissors() {
        Result result = gameStrategyFactory.createRockGameStrategy().play(moveFactory.createScissorsMove());
        assertEquals(result, Result.WIN);
    }

    @Test
    void testPlayRock() {
        Result result = gameStrategyFactory.createRockGameStrategy().play(moveFactory.createRockMove());
        assertEquals(result, Result.DRAW);
    }

    @Test
    void testPlayPaper() {
        Result result = gameStrategyFactory.createRockGameStrategy().play(moveFactory.createPaperMove());
        assertEquals(result, Result.LOSE);
    }
}
