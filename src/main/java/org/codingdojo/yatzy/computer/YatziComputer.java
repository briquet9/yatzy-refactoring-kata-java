package org.codingdojo.yatzy.computer;

import org.codingdojo.yatzy.Combination;

/**
 * - If a same dice number occurs 5 times, then the score is 50.
 * - Else: 0
 */
public class YatziComputer implements ScoreComputer {

    @Override
    public int computeScore(Combination combination) {
        return combination.getFrequencies().containsValue(5) ? 50 : 0;
    }
}
