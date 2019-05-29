package com.dana.health_tracker_backend;


import com.dana.health_tracker_backend.database.Exercise;
import com.dana.health_tracker_backend.database.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
public class ExerciseController {
    @Autowired
    ExerciseRepository exRepo;

    @GetMapping("all")
    public List<Exercise> getAllExercises(){
        return exRepo.findAll();
    }

    @PostMapping("new")
    public void addANewExercise(@RequestBody Exercise exercise){
        exRepo.save(exercise);
    }
}
