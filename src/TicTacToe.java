import javax.swing.*;

public class TicTacToe {
    public static void main(String[] args) {

        int[][] pos = new int[3][3];
        int player = 1;
        int win = 0;

        String[] options = new String[] {"1a", "1b", "1c", "2a", "2b", "2c","3a","3b","3c"};

        for(int turn = 1; turn < 10; turn++) {

            //round count, current player, ascci playfield and option
            int response = JOptionPane.showOptionDialog(null, "Runda " + turn + "! \n Det är spelare " + player + ":s tur \n\n  a b c\n1 " + pos[0][0] + pos[0][1] + pos[0][2] + "\n2 " + pos[1][0] + pos[1][1] + pos[1][2] + "\n3 " + pos[2][0] + pos[2][1] + pos[2][2], "Title",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);

            //absolutely horrendous code to choose what square to fill
            if (response == 0) {
                pos[0][0] = player;
            }
            if (response == 1) {
                pos[0][1] = player;
            }
            if (response == 2) {
                pos[0][2] = player;
            }
            if (response == 3) {
                pos[1][0] = player;
            }
            if (response == 4) {
                pos[1][1] = player;
            }
            if (response == 5) {
                pos[1][2] = player;
            }
            if (response == 6) {
                pos[2][0] = player;
            }
            if (response == 7) {
                pos[2][1] = player;
            }
            if (response == 8) {
                pos[2][2] = player;
            }

            //horizontal check
            for (int k = 0; k < 3; k++) {
                int rad = 0;
                for (int i = 0; i < 3; i++) {
                    if (pos[k][i] == player) {
                        rad++;
                        if (rad == 3) {
                            win++;
                        }
                    }
                }
            }

            //vertical check
            for (int k = 0; k < 3; k++) {
                int rad = 0;
                for (int i = 0; i < 3; i++) {
                    if (pos[i][k] == player) {
                        rad++;
                        if (rad == 3) {
                            win++;
                        }
                    }
                }
            }

            //top-bottom diagonal check
            int rad = 0;
            for (int k = 0; k < 3; k++) {
                if (pos[k][k] == player) {
                    rad++;
                    if (rad == 3) {
                        win++;
                        }
                    }
                }

            //bottom-top diagonal check
            int brad = 0;
            for (int k = 0; k < 3; k++) {
                if (pos[2 - k][k] == player) {
                    brad++;
                    if (brad == 3) {
                        win++;
                    }
                }
            }



            //win condition checker
            if (win == 1) {
                JOptionPane.showMessageDialog(null, "Spelare " + player + " vann!");
                System.exit(0);
            }

            //Player alternater

            if (player == 1) {
                player++;
            }
            else {
                player--;
            }
            }
        JOptionPane.showMessageDialog(null,"Ingen vann!");
        }
    }




