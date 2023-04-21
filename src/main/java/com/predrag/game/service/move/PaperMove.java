package com.predrag.game.service.move;

import com.predrag.game.model.Hand;
import com.predrag.game.service.strategy.GameStrategy;

public class PaperMove extends AbstractMove {

    public PaperMove(GameStrategy gameStrategy) {
        super(gameStrategy);
    }

    @Override
    public String getName() {
        return Hand.PAPER.name();
    }
}
