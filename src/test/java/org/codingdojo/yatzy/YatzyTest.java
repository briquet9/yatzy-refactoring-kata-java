package org.codingdojo.yatzy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class YatzyTest {

    // Upper section

    @ParameterizedTest
    @CsvSource({
        "1, 1, 2, 3, 4, 5",
        "2, 1, 2, 1, 4, 5",
        "0, 6, 2, 2, 4, 5",
        "4, 1, 2, 1, 1, 1"})
    public void testOnes(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, YatziManager.computeScore(Category.ONES, new Combination(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource({
        "4, 1, 2, 3, 2, 6",
        "10, 2, 2, 2, 2, 2"})
    public void testTwos(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, YatziManager.computeScore(Category.TWOS, new Combination(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource({
        "6, 1, 2, 3, 2, 3",
        "12, 2, 3, 3, 3, 3"})
    public void testThrees(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, YatziManager.computeScore(Category.THREES, new Combination(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource({
        "12, 4, 4, 4, 5, 5",
        "8, 4, 4, 5, 5, 5",
        "4, 4, 5, 5, 5, 5"})
    public void testFours(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, YatziManager.computeScore(Category.FOURS, new Combination(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource({
        "10, 4, 4, 4, 5, 5",
        "15, 4, 4, 5, 5, 5",
        "20, 4, 5, 5, 5, 5"})
    public void testFives(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, YatziManager.computeScore(Category.FIVES, new Combination(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource({
        "0, 4, 4, 4, 5, 5",
        "6, 4, 4, 6, 5, 5",
        "18, 6, 5, 6, 6, 5"})
    public void testSixes(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, YatziManager.computeScore(Category.SIXES, new Combination(d1, d2, d3, d4, d5)));
    }


    // Lower section

    @ParameterizedTest
    @CsvSource({
        "6, 3, 4, 3, 5, 6",
        "10, 5, 3, 3, 3, 5",
        "12, 5, 3, 6, 6, 5"})
    public void testOnePairs(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, new Yatzy().score_pair(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "16, 3, 3, 5, 4, 5",
        "16, 3, 3, 5, 5, 5"})
    public void testTwoPairs(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.two_pair(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "9, 3, 3, 3, 4, 5",
        "15, 5, 3, 5, 4, 5",
        "9, 3, 3, 3, 3, 5",
        "9, 3, 3, 3, 3, 3"})
    public void testThreeOfAKind(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.three_of_a_kind(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "12, 3, 3, 3, 3, 5",
        "20, 5, 5, 5, 4, 5"})
    public void testFourOfAKind(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.four_of_a_kind(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "15, 1, 2, 3, 4, 5",
        "15, 2, 3, 4, 5, 1",
        "0, 1, 2, 2, 4, 5"})
    public void testSmallStraight(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.smallStraight(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "20, 6, 2, 3, 4, 5",
        "20, 2, 3, 4, 5, 6",
        "0, 1, 2, 2, 4, 5"})
    public void testLargeStraight(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.largeStraight(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "18, 6, 2, 2, 2, 6",
        "0, 2, 3, 4, 5, 6"})
    public void testFullHouse(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.fullHouse(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "15, 2, 3, 4, 5, 1",
        "16, 3, 3, 4, 5, 1"})
    public void testChance(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.chance(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
        "50, 4, 4, 4, 4, 4",
        "0, 6, 6, 6, 6, 3"})
    public void testYatzy(int expected, int d1, int d2, int d3, int d4, int d5) {
        assertEquals(expected, Yatzy.yatzy(d1, d2, d3, d4, d5));
    }
}
