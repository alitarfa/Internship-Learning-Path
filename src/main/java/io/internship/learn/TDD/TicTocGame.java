package io.internship.learn.TDD;

public class TicTocGame {


    private static char lastPlayer = '0';

    private Character character[][] = {
            {'0', '0', '0'},
            {'0', '0', '0'},
            {'0', '0', '0'},
    };


    public String play(int x, int y) {
        checkX(x, y);
        checkY(x, y);
        setBox(x, y);
        lastPlayer = nextPlayer();


        // check if there is any winner

        for (int i = 0; i < 3; i++) {
            // vertical check
            if (character[0][i] == (lastPlayer) &&
                    character[1][i] == (lastPlayer) &&
                    character[2][i] == (lastPlayer)) {
                return lastPlayer + " Is The Winner";
            }
        }


        return "No Winner !!!";
    }


    public void checkX(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X is outside of board");
        }
    }

    public void checkY(int x, int y) {
        if (y < 1 || y > 3) {
            throw new RuntimeException("Y is outside of board");
        }
    }

    public void setBox(int x, int y) {
        if (character[x - 1][y - 1] == 'x') {
            throw new RuntimeException("Place Is Occupied");
        } else {
            character[x - 1][y - 1] = 'x';
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'x') {
            return 'o';
        }
        return 'x';
    }
}
