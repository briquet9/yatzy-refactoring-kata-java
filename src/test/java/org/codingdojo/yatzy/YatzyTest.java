package org.codingdojo.yatzy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class YatzyTest {

    @ParameterizedTest
    @CsvSource({
        "0, ONES, 6, 2, 2, 4, 5",
        "1, ONES, 1, 2, 3, 4, 5",
        "3, ONES, 1, 1, 1, 4, 5",
        "4, TWOS, 1, 2, 3, 2, 6",
        "12, THREES, 2, 3, 3, 3, 3",
        "12, FOURS, 4, 4, 4, 5, 5",
        "15, FIVES, 4, 4, 5, 5, 5",
        "18, SIXES, 6, 5, 6, 6, 5",
        "0, ONE_PAIR, 1, 2, 3, 4, 5",
        "10, ONE_PAIR, 5, 3, 3, 3, 5",
        "12, ONE_PAIR, 5, 3, 6, 6, 5",
        "16, TWO_PAIRS, 3, 3, 5, 4, 5",
        "16, TWO_PAIRS, 3, 3, 5, 5, 5",
        "0, TWO_PAIRS, 3, 3, 3, 3, 1",
        "0, THREE_OF_A_KIND, 3, 3, 1, 4, 5",
        "15, THREE_OF_A_KIND,5, 3, 5, 4, 5",
        "15, THREE_OF_A_KIND,5, 5, 5, 4, 5",
        "12, FOUR_OF_A_KIND, 3, 3, 3, 3, 5",
        "20, FOUR_OF_A_KIND, 5, 5, 5, 4, 5",
        "15, SMALL_STRAIGHT, 1, 2, 3, 4, 5",
        "0, SMALL_STRAIGHT, 2, 3, 4, 5, 6",
        "0, SMALL_STRAIGHT, 1, 2, 2, 4, 5",
        "20, LARGE_STRAIGHT, 6, 2, 3, 4, 5",
        "0, LARGE_STRAIGHT, 1, 2, 2, 4, 5",
        "18, FULL_HOUSE, 6, 2, 2, 2, 6",
        "0, FULL_HOUSE, 2, 3, 4, 5, 6",
        "0, FULL_HOUSE, 2, 2, 4, 5, 6",
        "0, FULL_HOUSE, 4, 4, 4, 4, 4",
        "16, CHANCE,  3, 3, 4, 5, 1",
        "50, YATZY, 4, 4, 4, 4, 4",
        "0, YATZY, 6, 6, 6, 6, 3"
    })
    void testYatzy(int expected, String categoryName, int d1, int d2, int d3, int d4, int d5) {
        Category category = Category.valueOf(categoryName);
        assertEquals(expected, YatziManager.computeScore(category, new Combination(d1, d2, d3, d4, d5)));
    }
}
