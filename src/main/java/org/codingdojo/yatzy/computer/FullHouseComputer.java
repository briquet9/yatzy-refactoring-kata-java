package org.codingdojo.yatzy.computer;

import org.codingdojo.yatzy.Combination;

/**
 * - If a combination contains 3 dices of a number and 2 dices of another number,
 * then scores the sum of these dice numbers
 * - Else: 0
 */
public class FullHouseComputer implements ScoreComputer {

    @Override
    public int computeScore(Combination combination) {
        if (combination.getFrequencies().containsValue(2) && combination.getFrequencies().containsValue(3)) {
            return combination.sum();
        }
        return 0;
    }
}
