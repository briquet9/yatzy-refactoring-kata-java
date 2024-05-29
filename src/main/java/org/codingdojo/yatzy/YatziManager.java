package org.codingdojo.yatzy;

import org.codingdojo.yatzy.computer.ChanceComputer;
import org.codingdojo.yatzy.computer.NumberComputer;
import org.codingdojo.yatzy.computer.ScoreComputer;
import org.codingdojo.yatzy.computer.YatziComputer;

public class YatziManager {

    public static int computeScore(Category category, Combination combination) {
        return getScoreComputer(category).computeScore(combination);
    }

    private static ScoreComputer getScoreComputer(Category category) {
        return switch (category) {
            case ONES -> new NumberComputer(1);
            case TWOS -> new NumberComputer(2);
            case THREES -> new NumberComputer(3);
            case FOURS -> new NumberComputer(4);
            case FIVES -> new NumberComputer(5);
            case SIXES -> new NumberComputer(6);
            case ONE_PAIR -> null;
            case TWO_PAIRS -> null;
            case THREE_OF_A_KIND -> null;
            case FOUR_OF_A_KIND -> null;
            case SMALL_STRAIGHT -> null;
            case LARGE_STRAIGHT -> null;
            case FULL_HOUSE -> null;
            case CHANCE -> new ChanceComputer();
            case YATZY -> new YatziComputer();
        };
    }

}