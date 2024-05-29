package org.codingdojo.yatzy.computer;

import org.codingdojo.yatzy.Combination;

import java.util.HashMap;
import java.util.Map;

public class YatziComputer implements ScoreComputer {

    @Override
    public int computeScore(Combination combination) {
        return getFrequencies(combination).containsValue(5) ? 50 : 0;
    }

    public Map<Integer, Integer> getFrequencies(Combination combination) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        combination.getDices().forEach(
            dice -> frequencies.put(dice, frequencies.getOrDefault(dice, 0) + 1)
        );

        return frequencies;
    }
}
