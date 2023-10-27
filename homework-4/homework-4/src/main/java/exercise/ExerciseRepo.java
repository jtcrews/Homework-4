
package exercise;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jakec
 */
public interface ExerciseRepo extends JpaRepository<Exercise, Long> {
    
    public List<Exercise> findByName(String name);
    
}
