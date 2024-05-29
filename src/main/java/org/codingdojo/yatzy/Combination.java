package org.codingdojo.yatzy;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Getter
public class Combination {

    private Collection<Integer> dices;

    public Combination(int d1, int d2, int d3, int d4, int d5) {
        dices = new ArrayList<>();
        dices.add(d1);
        dices.add(d2);
        dices.add(d3);
        dices.add(d4);
        dices.add(d5);
    }

    public Map<Integer, Integer> getFrequencies() {
        Map<Integer, Integer> frequencies = new HashMap<>();

        dices.forEach(
            dice -> frequencies.put(dice, frequencies.getOrDefault(dice, 0) + 1)
        );

        return frequencies;
    }

    public int sum() {
        return dices.stream().reduce(0, Integer::sum);
    }

}
