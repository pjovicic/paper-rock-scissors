package com.predrag.game.service.move;

import com.predrag.game.model.Result;
import com.predrag.game.service.strategy.GameStrategyFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaperMoveTest {

    private static MoveFactory moveFactory;
    private static Move paperMove;

    @BeforeAll
    static void setup() {
        moveFactory = new MoveFactory(GameStrategyFactory.getInstance());
        paperMove = moveFactory.createPaperMove();
    }

    @Test
    void testPlayAgainstRock() {
        Result result = paperMove.playAgainst(Objects.requireNonNull(moveFactory.createRockMove()));
        assertEquals(result, Result.WIN);
    }

    @Test
    void testPlayAgainstPaper() {
        Result result = paperMove.playAgainst(Objects.requireNonNull(moveFactory.createPaperMove()));
        assertEquals(result, Result.DRAW);
    }

    @Test
    void testPlayAgainstScissors() {
        Result result = paperMove.playAgainst(Objects.requireNonNull(moveFactory.createScissorsMove()));
        assertEquals(result, Result.LOSE);
    }
}
