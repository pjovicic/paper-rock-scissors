package com.predrag.game.service.move;

import com.predrag.game.model.Hand;
import com.predrag.game.service.strategy.GameStrategy;

public class ScissorsMove extends AbstractMove {

    public ScissorsMove(GameStrategy gameStrategy) {
        super(gameStrategy);
    }

    @Override
    public String getName() {
        return Hand.SCISSORS.name();
    }
}
