package org.codingdojo.yatzy.computer;

import org.codingdojo.yatzy.Combination;

/**
 * The score is the sum of all dice numbers.
 */
public class ChanceComputer implements ScoreComputer {

    @Override
    public int computeScore(Combination combination) {
        return combination.sum();
    }
}
