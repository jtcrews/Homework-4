package exercise;

/**
 *
 * @author Jacob Crews
 * CSC-340
 * Homework-4
 * October 24, 2023
 */
public class Exercise {

    private long id;
    private String name;
    private int sets;
    private int reps;

    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }
}
