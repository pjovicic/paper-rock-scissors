package com.predrag.game.service.strategy;

import com.predrag.game.model.Result;
import com.predrag.game.service.move.Move;
import com.predrag.game.service.move.PaperMove;
import com.predrag.game.service.move.RockMove;
import com.predrag.game.service.move.ScissorsMove;
import com.predrag.game.util.Constants;

public class RockGameStrategy implements GameStrategy {

    @Override
    public Result play(Move move) {
        if (move instanceof ScissorsMove) {
            return Result.WIN;
        }

        if (move instanceof RockMove) {
            return Result.DRAW;
        }

        if (move instanceof PaperMove) {
            return Result.LOSE;
        }

        throw new IllegalArgumentException(Constants.NOT_ABLE_TO_PLAY_AGAINST + move);
    }
}
