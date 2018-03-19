package bullsandcowsgame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    static int winW = 500;
    static int winH = 400;

    JTextField guessNumTextBox, inputTextBox;
    JButton buttonGuess;
    String mirror, guessNum;
    TextArea textBox;
    boolean gameOver = false;

    public Main() {

        setLayout(new FlowLayout());

        guessNum = genNumber();

        /* Reveals the secret number 
        guessNumTextBox = new JTextField(10);
        guessNumTextBox.setText(guessNum);
        add(guessNumTextBox);
         */
        inputTextBox = new JTextField(10);
        add(inputTextBox);

        buttonGuess = new JButton("Guess");
        add(buttonGuess);
        buttonGuess.addActionListener(this);

        textBox = new TextArea(16, 58);
        textBox.setEditable(false);
        add(textBox);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bulls & Cows");
        setSize(winW, winH);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Main();
    }

    public String genNumber() {
        int a, b, c, d;
        do {
            a = (int) (1 + Math.random() * 10);
            b = (int) (1 + Math.random() * 10);
            c = (int) (1 + Math.random() * 10);
            d = (int) (1 + Math.random() * 10);

        } while (!(a != b && a != c && a != d && b != c && b != d && c != d));

        int res = a * 1000 + b * 100 + c * 10 + d;
        return (Integer.toString(res));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ranch = e.getSource();

        try {
            if (ranch == buttonGuess) {
                String res = getHint(guessNum, inputTextBox.getText()) + "\n";
                textBox.append(res);
            }
        } catch (Exception ex) {
        }
    }

    public String getHint(String secret, String guess) {

        int countBull = 0;
        int countCow = 0;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);

            if (c1 == c2) {
                countBull++;
            } else {
                arr1[c1 - '0']++;
                arr2[c2 - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            countCow += Math.min(arr1[i], arr2[i]);
        }

        if (countBull == secret.length()) {
            buttonGuess.setEnabled(false);
            return "You win!";
        }
        return guess + ": " + countBull + "A" + countCow + "B";
    }
}
