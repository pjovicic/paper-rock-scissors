package com.predrag.game.main;

import com.predrag.game.controller.GameController;
import com.predrag.game.model.Game;
import com.predrag.game.util.Constants;

public class PaperRockScissorsGame {

    public static void main(String[] args) {
        System.out.println(Constants.WELCOME_MESSAGE);

        Game game = GameController.getInstance().play(Constants.NUMBER_OF_ROUNDS);

        System.out.printf(Constants.WIN_MESSAGE_WITH_PLACEHOLDERS,
                game.getPlayerA().getName(),
                game.getGameResults().getPlayerAWins(),
                game.getGameResults().getRoundsCounter());
        System.out.printf(Constants.WIN_MESSAGE_WITH_PLACEHOLDERS,
                game.getPlayerB().getName(),
                game.getGameResults().getPlayerBWins(),
                game.getGameResults().getRoundsCounter());
        System.out.printf(Constants.TIE_MESSAGE_WITH_PLACEHOLDERS, game.getGameResults().getDraws(), game.getGameResults().getRoundsCounter());
    }
}
