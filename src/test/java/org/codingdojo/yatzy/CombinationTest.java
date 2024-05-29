package org.codingdojo.yatzy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CombinationTest {

    private Combination combination;

    @BeforeEach
    void setUp() {
        combination = new Combination(1, 2, 3, 4, 4);
    }

    @Test
    void testCombinationSuccess() {
        assertIterableEquals(Arrays.asList(1, 2, 3, 4, 4), combination.getDices());
    }

    @Test
    void testCombinationError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Combination(0, 2, 3, 4, 5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Combination(1, 2, 3, 4, 10));
    }

    @Test
    void testGetFrequencies() {
        Map<Integer, Integer> expectedFrequencies = Map.of(
            1, 1,
            2, 1,
            3, 1,
            4, 2);
        assertEquals(expectedFrequencies, combination.getFrequencies());
    }

    @Test
    void testSum() {
        assertEquals(14, combination.sum());
    }
}
