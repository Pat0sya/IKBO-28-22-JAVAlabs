package mirea.javalabs.lab7;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class FootballMatch extends JFrame implements ActionListener {

    private int Milan = 0;
    private int Madrid = 0;
    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    public FootballMatch() {
        setTitle("Madrid VS Milan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JButton milanButton = new JButton("AC Milan");
        milanButton.addActionListener(this);
        panel.add(milanButton);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(this);
        panel.add(madridButton);

        resultLabel = new JLabel("Result: " + Milan + " X " + Madrid);
        panel.add(resultLabel);

        lastScorerLabel = new JLabel("Last Scorer: N/A");
        panel.add(lastScorerLabel);

        winnerLabel = new JLabel("Winner: DRAW");
        panel.add(winnerLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AC Milan")) {
            Milan++;
            resultLabel.setText("Result: " + Milan + " X " + Madrid);
            lastScorerLabel.setText("Last Scorer: AC Milan");
            checkWinner();
        } else if (e.getActionCommand().equals("Real Madrid")) {
            Madrid++;
            resultLabel.setText("Result: " + Milan + " X " + Madrid);
            lastScorerLabel.setText("Last Scorer: Real Madrid");
            checkWinner();
        }
    }

    private void checkWinner() {
        if (Milan > Madrid) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (Madrid > Milan) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}