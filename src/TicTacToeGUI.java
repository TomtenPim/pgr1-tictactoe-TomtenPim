
import javax.swing.*;

public class TicTacToeGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToeGUI");
        frame.setContentPane(new TicTacToeGUI().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel Panel;
}



