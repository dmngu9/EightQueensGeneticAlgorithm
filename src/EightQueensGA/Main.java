package EightQueensGA;

/**
 * Created by dmngu9 on 1/28/2017.
 */
public class Main {

    public static void main (String[] args) {
        GeneticAlgo geneticAlgo = new GeneticAlgo(100);
        int generation = 1;
        while (geneticAlgo.getHighestFitness() != 0) {
            geneticAlgo.naturalSelection();
            System.out.println("Generation: " + generation);
            System.out.println("Fitness: " + geneticAlgo.getHighestFitness());
            System.out.print("Fittest: ");
            geneticAlgo.getFittestChromosome().displayChromosome();
            System.out.println("\n===============================");

            generation++;
        }
    }
}
