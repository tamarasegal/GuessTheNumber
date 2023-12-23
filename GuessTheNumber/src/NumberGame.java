import javax.swing.*;
import java.awt.*;
public class NumberGame {
    private JFrame frame;
    private JPanel bottom;
    private JTextField input;
    private JLabel instructions;
    private JButton submit;
    private int secretNumber;

    public NumberGame () {
        frame= new JFrame();
        frame.setLayout(new GridLayout(2, 1));
        bottom = new JPanel(new GridLayout(1, 2));
        input = new JTextField("");
        instructions = new JLabel("Guess and integer between 1 and 10,000");
        submit = new JButton("Submit");
        submit.addActionListener(new ActionListenerNumber(this));
        secretNumber = (int) (Math.random() * 9999) + 1;
        bottom.add(input);
        bottom.add(submit);
        frame.add(instructions);
        frame.add(bottom);
        frame.setSize(450,  650);
        frame.setVisible(true);

    }

    public int check(int guess) {
        return secretNumber - guess;
    }

    public void setText(String text) {
        instructions.setText(text);
    }

    public String getInput() {
        return input.getText();
    }
    public JFrame getFrame() {
        return frame;
    }

}
