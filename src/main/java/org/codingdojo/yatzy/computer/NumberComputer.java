package org.codingdojo.yatzy.computer;

import lombok.AllArgsConstructor;
import org.codingdojo.yatzy.Combination;

/**
 * The number computer sums the dices numbers for the dices that matches the expected number.
 */
@AllArgsConstructor
public class NumberComputer implements ScoreComputer {

    private int number;

    @Override
    public int computeScore(Combination combination) {
        return combination
            .getDices()
            .stream()
            .reduce(0, (sum, dice) -> dice == number ? sum + number : sum);
    }
}
