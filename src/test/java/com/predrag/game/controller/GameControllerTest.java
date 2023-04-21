package com.predrag.game.controller;

import com.predrag.game.model.Game;
import com.predrag.game.model.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameControllerTest {

    private static final int NUMBER_OF_ROUNDS = 10;
    private static GameController gameController;

    @BeforeAll
    static void setup() {
        gameController = new GameController();
    }

    @Test
    void testPlay() {
        Game game = gameController.play(NUMBER_OF_ROUNDS);
        assertEquals(Hand.PAPER.name(), game.getPlayerA().getMove().getName());
        assertEquals(NUMBER_OF_ROUNDS, game.getGameResults().getRoundsCounter());
    }
}
