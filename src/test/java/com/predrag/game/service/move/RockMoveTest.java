package com.predrag.game.service.move;

import com.predrag.game.model.Result;
import com.predrag.game.service.strategy.GameStrategyFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockMoveTest {

    private static MoveFactory moveFactory;
    private static Move rockMove;

    @BeforeAll
    static void setup() {
        moveFactory = new MoveFactory(GameStrategyFactory.getInstance());
        rockMove = moveFactory.createRockMove();
    }

    @Test
    void testPlayAgainstScissors() {
        Result result = rockMove.playAgainst(Objects.requireNonNull(moveFactory.createScissorsMove()));
        assertEquals(result, Result.WIN);
    }

    @Test
    void testPlayAgainstRock() {
        Result result = rockMove.playAgainst(Objects.requireNonNull(moveFactory.createRockMove()));
        assertEquals(result, Result.DRAW);
    }

    @Test
    void testPlayAgainstPaper() {
        Result result = rockMove.playAgainst(Objects.requireNonNull(moveFactory.createPaperMove()));
        assertEquals(result, Result.LOSE);
    }
}
