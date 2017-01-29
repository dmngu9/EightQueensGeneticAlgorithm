package EightQueensGA;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dmngu9 on 1/28/2017.
 */
public class Population {
    private Chromosome[] chromosomes;

    public Population(int size) {
        this.chromosomes = new Chromosome[size];
        initializePopulation();
    }

    public void calculateFitness () {
        for (int i = 0; i < this.chromosomes.length; i++) {
            this.chromosomes[i].calculateFitness();
        }
        sortPopulationBasedOnFitness();
    }

    public void sortPopulationBasedOnFitness () {
        Arrays.sort(this.chromosomes, (chromosome1, chromosome2) -> {
            int flag = 0;
            if (chromosome1.getFitness() > chromosome2.getFitness())
                flag = -1;
            else if (chromosome1.getFitness() < chromosome2.getFitness())
                flag = 1;
            return flag;
        });
    }

    public Chromosome getChromosome (int index) {
        return this.chromosomes[index];
    }

    public void setChromosome (int index, Chromosome chromosome) {
        this.chromosomes[index] = chromosome;
    }

    public void displayPopulation () {
        for (Chromosome chromosome : this.chromosomes) {
            chromosome.displayChromosome();
        }
    }

    private void initializePopulation () {
        for (int i = 0; i < this.chromosomes.length; i++) {
            this.chromosomes[i] = new Chromosome();
            this.chromosomes[i].generateChromosome();
        }
    }
}
