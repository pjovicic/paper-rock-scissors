package com.predrag.game.service.move;

import com.predrag.game.model.Result;
import com.predrag.game.service.strategy.GameStrategyFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScissorsMoveTest {

    private static MoveFactory moveFactory;
    private static Move scissorsMove;

    @BeforeAll
    static void setup() {
        moveFactory = new MoveFactory(GameStrategyFactory.getInstance());
        scissorsMove = moveFactory.createScissorsMove();
    }

    @Test
    void testPlayAgainstPaper() {
        Result result = scissorsMove.playAgainst(Objects.requireNonNull(moveFactory.createPaperMove()));
        assertEquals(result, Result.WIN);
    }

    @Test
    void testPlayAgainstScissors() {
        Result result = scissorsMove.playAgainst(Objects.requireNonNull(moveFactory.createScissorsMove()));
        assertEquals(result, Result.DRAW);
    }

    @Test
    void testPlayAgainstRock() {
        Result result = scissorsMove.playAgainst(Objects.requireNonNull(moveFactory.createRockMove()));
        assertEquals(result, Result.LOSE);
    }
}
