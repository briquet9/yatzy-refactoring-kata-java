package org.codingdojo.yatzy.computer;

import lombok.AllArgsConstructor;
import org.codingdojo.yatzy.Combination;

@AllArgsConstructor
public class NumberComputer implements ScoreComputer {

    private int number;

    @Override
    public int computeScore(Combination combination) {
        int sum = 0;
        for (int dice : combination.getDices()) {
            if (dice == number) {
                sum += number;
            }
        }
        return sum;
    }
}
