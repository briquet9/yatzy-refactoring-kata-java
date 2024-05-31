package org.codingdojo.yatzy.computer;

import lombok.AllArgsConstructor;
import org.codingdojo.yatzy.Combination;

/**
 * - If a combination contains a straight (1,2,3,4,5 or 2,3,4,5,6 for the small and large straight respectively)
 * then scores the sum of the dice numbers
 * - Else: 0
 */
@AllArgsConstructor
public class StraightComputer implements ScoreComputer {

    private int includedValue;

    @Override
    public int computeScore(Combination combination) {
        if (eachNumberOccursOnce(combination) && combination.getDices().contains(includedValue)) {
            return combination.sum();
        }
        return 0;
    }

    private boolean eachNumberOccursOnce(Combination combination) {
        return combination.getFrequencies().entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .count() == 5;
    }
}
