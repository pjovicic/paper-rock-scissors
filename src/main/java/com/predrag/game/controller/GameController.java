package com.predrag.game.controller;

import com.predrag.game.model.Game;
import com.predrag.game.model.GameResults;
import com.predrag.game.model.Player;
import com.predrag.game.model.Result;
import com.predrag.game.service.move.Move;
import com.predrag.game.service.move.MoveFactory;
import com.predrag.game.service.strategy.GameStrategyFactory;
import com.predrag.game.util.Constants;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameController {

    private static GameController instance;

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public Game play(int numberOfRounds) {
        MoveFactory moveFactory = new MoveFactory(GameStrategyFactory.getInstance());

        Move paper = moveFactory.createPaperMove();
        Move rock = moveFactory.createRockMove();
        Move scissors = moveFactory.createScissorsMove();

        List<Move> moves = Arrays.asList(paper, rock, scissors);

        Player playerA = new Player(Constants.PLAYER_A);
        playerA.setMove(paper);
        Player playerB = new Player(Constants.PLAYER_B);
        Game game = new Game(playerA, playerB);

        int playerAWins = Constants.INITIAL_VALUE;
        int playerBWins = Constants.INITIAL_VALUE;
        int draws = Constants.INITIAL_VALUE;

        for (int i = 0; i < numberOfRounds; i++) {
            playerB.setMove(getRandomMoveFromList(moves));
            Result roundResult = playerA.getMove().playAgainst(playerB.getMove());

            switch (roundResult) {
                case WIN -> playerAWins++;
                case LOSE -> playerBWins++;
                default -> draws++;
            }
        }

        GameResults gameResults = new GameResults(playerAWins, playerBWins, draws, numberOfRounds);
        game.setGameResults(gameResults);
        return game;
    }

    private Move getRandomMoveFromList(List<Move> moves) {
        Random random = new Random();
        return moves.get(random.nextInt(moves.size()));
    }

}
