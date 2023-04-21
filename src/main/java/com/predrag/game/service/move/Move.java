package com.predrag.game.service.move;

import com.predrag.game.model.Result;
import com.predrag.game.service.strategy.GameStrategy;

public interface Move {

    String getName();

    void setGameStrategy(GameStrategy strategy);

    GameStrategy getGameStrategy();

    Result playAgainst(Move move);

}
