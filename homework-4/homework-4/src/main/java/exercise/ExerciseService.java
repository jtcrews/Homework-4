
package exercise;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jakec
 */
public class ExerciseService {
    @Autowired
    private ExerciseRepo repo;
    
    public List<Exercise> getAllExercises() {
        return repo.findAll();
    }
    
    public Exercise getExercise(long exerciseId) {
       return repo.getReferenceById(exerciseId);
    }
    
    public void saveExercise(Exercise exercise) {
        repo.save(exercise);
    }
    
    public void deleteExercise(long exerciseId) {
        repo.deleteById(exerciseId);
    }
}
