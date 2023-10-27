package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jakec
 */
@Controller
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/all")
    public String getAllExercises(Model model) {
        model.addAttribute("productList", exerciseService.getAllExercises());
        return "exercise/list-exercise";
    }

    @GetMapping("/id={exerciseId}")
    public String getProduct(@PathVariable long exerciseId, Model model) {
        model.addAttribute("exercise", exerciseService.getExercise(exerciseId));
        return "exercise/exercisedetail";
    }

    @PostMapping("/create")
    public String createExercise(Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return "redirect:/exercise/all";
    }

    @PostMapping("/update")
    public String updateExercise(Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return "redirect:/exercise/all";
    }

    @GetMapping("/delete/id={exerciseId}")
    public String deleteExercise(@PathVariable long exerciseId, Model model) {
        exerciseService.deleteExercise(exerciseId);
        return "redirect:/exercise/all";
    }
}

