package com.predrag.game.service.strategy;

import com.predrag.game.model.Result;
import com.predrag.game.service.move.Move;

public interface GameStrategy {

    Result play(Move move);
}
