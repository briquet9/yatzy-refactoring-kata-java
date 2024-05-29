package org.codingdojo.yatzy.computer;

import org.codingdojo.yatzy.Combination;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * - If there are 2 distinct pairs in a combination, scores the sums of these pairs
 * - Otherwise: 0
 */
public class TwoPairsComputer implements ScoreComputer {

    @Override
    public int computeScore(Combination combination) {
        Set<Map.Entry<Integer, Integer>> pairs = combination
            .getFrequencies()
            .entrySet()
            .stream()
            .filter(e -> e.getValue() >= 2)
            .collect(Collectors.toSet());

        if (pairs.size() == 2) {
            return pairs.stream().mapToInt(e -> e.getKey() * 2).sum();
        }

        return 0;
    }
}
