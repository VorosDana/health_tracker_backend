package com.dana.health_tracker_backend.database;


import org.springframework.data.jpa.repository.JpaRepository;


public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
