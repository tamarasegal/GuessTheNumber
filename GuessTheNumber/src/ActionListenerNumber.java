import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerNumber implements ActionListener {
    private NumberGame g;
    public ActionListenerNumber(NumberGame g) {
        this.g = g;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int guess = Integer.parseInt(g.getInput());
            if (g.check(guess) > 0)
                g.setText("too low");
            else if (g.check(guess) < 0)
                g.setText("too high");
            else
                JOptionPane.showMessageDialog(g.getFrame(), "You guessed the number!");
        }
        catch (Exception error) {
            JOptionPane.showMessageDialog(g.getFrame(), "you did not enter a number");
        }

    }



}
