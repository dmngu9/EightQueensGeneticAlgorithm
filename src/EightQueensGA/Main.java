package EightQueensGA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dmngu9 on 1/28/2017.
 */
public class Main {

    public static void main (String[] args) {
        GeneticAlgo geneticAlgo = new GeneticAlgo(100);
        int generation = 1;

        JFrame jFrame = new JFrame("Chess board");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLayout(new BorderLayout());;
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        ChessBoard board = new ChessBoard();
        JLabel jLabel = new JLabel("Label");
        jLabel.setVisible(true);
        jLabel.setText("Generation: " + generation);
        board.add(jLabel, BorderLayout.EAST);
        board.setFittestChromosome(geneticAlgo.getFittestChromosome());
        jFrame.add(board, BorderLayout.CENTER);
        jFrame.pack();

        while (geneticAlgo.getFittestChromosome().getFitness() != 0) {
            geneticAlgo.naturalSelection();

            jFrame.remove(board);
            jFrame.revalidate();
            jFrame.repaint();
            board.setFittestChromosome(geneticAlgo.getFittestChromosome());
            jLabel.setText("Generation: " + generation);
            board.add(jLabel);
            jFrame.add(board,BorderLayout.CENTER);
            jFrame.pack();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // Do nothing
            }
            generation++;
        }
        System.out.print("Done");
    }
}
