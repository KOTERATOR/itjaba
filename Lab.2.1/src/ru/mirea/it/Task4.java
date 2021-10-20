package ru.mirea.it;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task4 extends JFrame {
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;
    private JButton firstTeamButton, secondTeamButton;

    final String firstTeamName = "AC Milan", secondTeamName = "Real Madrid";
    int firstTeamScore = 0, secondTeamScore = 0;

    public Task4() {
        super("Task 4");
        setLayout(new GridLayout(5, 1));
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        lastScorerLabel = new JLabel();
        lastScorerLabel.setHorizontalAlignment(JLabel.CENTER);
        winnerLabel = new JLabel();
        winnerLabel.setHorizontalAlignment(JLabel.CENTER);
        firstTeamButton = new JButton("AC Milan");
        secondTeamButton = new JButton("Real Madrid");

        firstTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstTeamScore++;
                updateLastScorerLabel(firstTeamName);
                updateResultLabel();
                updateWinnerLabel();
            }
        });

        secondTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondTeamScore++;
                updateLastScorerLabel(secondTeamName);
                updateResultLabel();
                updateWinnerLabel();
            }
        });

        add(resultLabel);
        add(lastScorerLabel);
        add(firstTeamButton);
        add(secondTeamButton);
        add(winnerLabel);

        updateResultLabel();
        updateLastScorerLabel(null);
        updateWinnerLabel();

    }

    private void updateResultLabel() {
        resultLabel.setText(String.format("Result: %d X %d", firstTeamScore, secondTeamScore));
    }

    private void updateLastScorerLabel(String lastScorer) {
        lastScorerLabel.setText(String.format("Last Scorer: %s", (lastScorer == null ? "N/A" : lastScorer)));
    }

    private void updateWinnerLabel() {
        String winner;
        if (secondTeamScore > firstTeamScore)
            winner = secondTeamName;
        else if (firstTeamScore > secondTeamScore)
            winner = firstTeamName;
        else
            winner = "DRAW";

        winnerLabel.setText(String.format("Winner: %s", winner));
    }
}
