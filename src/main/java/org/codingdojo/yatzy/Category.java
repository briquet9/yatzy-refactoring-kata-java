package org.codingdojo.yatzy;

import lombok.AllArgsConstructor;
import org.codingdojo.yatzy.computer.ChanceComputer;
import org.codingdojo.yatzy.computer.FrequencyComputer;
import org.codingdojo.yatzy.computer.FullHouseComputer;
import org.codingdojo.yatzy.computer.NumberComputer;
import org.codingdojo.yatzy.computer.ScoreComputer;
import org.codingdojo.yatzy.computer.StraightComputer;
import org.codingdojo.yatzy.computer.TwoPairsComputer;
import org.codingdojo.yatzy.computer.YatziComputer;

@AllArgsConstructor
public enum Category implements ScoreComputer {

    // Upper section
    ONES(new NumberComputer(1)),
    TWOS(new NumberComputer(2)),
    THREES(new NumberComputer(3)),
    FOURS(new NumberComputer(4)),
    FIVES(new NumberComputer(5)),
    SIXES(new NumberComputer(6)),

    // Lower section
    ONE_PAIR(new FrequencyComputer(2)),
    TWO_PAIRS(new TwoPairsComputer()),
    THREE_OF_A_KIND(new FrequencyComputer(3)),
    FOUR_OF_A_KIND(new FrequencyComputer(4)),
    SMALL_STRAIGHT(new StraightComputer(1)),
    LARGE_STRAIGHT(new StraightComputer(6)),
    FULL_HOUSE(new FullHouseComputer()),
    CHANCE(new ChanceComputer()),
    YATZY(new YatziComputer());

    private final ScoreComputer scoreComputer;

    @Override
    public int computeScore(Combination combination) {
        return scoreComputer.computeScore(combination);
    }
}
