package org.codingdojo.yatzy.computer;


import lombok.AllArgsConstructor;
import org.codingdojo.yatzy.Combination;

import java.util.Map;

/**
 * - If a dice number occurs at a minimum expected frequency,
 * the score is the multiplication: dice number x minimum frequency
 * - Otherwise: the score is 0.
 */
@AllArgsConstructor
public class FrequencyComputer implements ScoreComputer {

    private int frequency;
    
    @Override
    public int computeScore(Combination combination) {
        return combination.getFrequencies().entrySet().stream()
            .filter(e -> e.getValue() >= frequency)
            .max(Map.Entry.comparingByKey())
            .map(e -> e.getKey() * frequency)
            .orElse(0);
    }
}
