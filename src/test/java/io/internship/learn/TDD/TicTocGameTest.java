package io.internship.learn.TDD;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TicTocGameTest {


    private TicTocGame ticTocGame;

    @BeforeEach
    void setUp() {
        ticTocGame = new TicTocGame();
    }

    @Test
    void whenXisOutOfBoardShouldThrowException() {
        assertThrows(RuntimeException.class,
                () -> ticTocGame.play(5, 1), "Should Throw Runtime Ex if the x is out of Board");
    }

    // we need to write code that force fail then we make it pass then we ref it
    @Test
    void whenYisOutOfBoardShouldThrowException() {
        assertThrows(RuntimeException.class,
                () -> ticTocGame.play(5, 2), "Should Throw Runtime Ex if the Y is out of Board");
    }

    @Test
    void whenPlaceIsOccupiedShouldReturnException() {
        ticTocGame.play(1, 1);
        assertThrows(RuntimeException.class,
                () -> ticTocGame.play(1, 1), "Should Throw Runtime Ex Is Occupied");
    }

    @Test
    void firstShouldX() {
        char actual = ticTocGame.nextPlayer();
        assertEquals('x', actual);
    }

    @Test
    void xPlayedThenNextPlayerO() {
        ticTocGame.play(1, 1); // x
        char actual = ticTocGame.nextPlayer(); // o
        assertEquals('o', actual);
    }


    @Test
    void playNoWinner() {
        String actual = ticTocGame.play(1, 1);
        assertEquals("No Winner !!!", actual);
    }

    @Test
    void Winner() {
        ticTocGame.play(1, 1); // x
        ticTocGame.play(1, 2); // o
        ticTocGame.play(2, 1); // x
        ticTocGame.play(2, 2); // o
        String actual = ticTocGame.play(3, 1);//x
        assertEquals("x Is The Winner", actual);

    }
}