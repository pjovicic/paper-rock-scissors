package com.predrag.game.service.move;

import com.predrag.game.service.strategy.GameStrategyFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveFactoryTest {

    private static MoveFactory moveFactory;

    @BeforeAll
    static void setup() {
        moveFactory = new MoveFactory(GameStrategyFactory.getInstance());
    }

    @Test
    void testCreatePaperMove() {
        Move result = moveFactory.createPaperMove();
        assertTrue(result instanceof PaperMove);
    }

    @Test
    void testCreateRockMove() {
        Move result = moveFactory.createRockMove();
        assertTrue(result instanceof RockMove);
    }

    @Test
    void testCreateScissorsMove() {
        Move result = moveFactory.createScissorsMove();
        assertTrue(result instanceof ScissorsMove);
    }

}
