package org.codingdojo.yatzy.computer;

import org.codingdojo.yatzy.Combination;

public class ChanceComputer implements ScoreComputer {

    @Override
    public int computeScore(Combination combination) {
        return combination.getDices()
            .stream()
            .mapToInt(Integer::intValue)
            .sum();
    }
}
