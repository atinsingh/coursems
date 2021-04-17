package io.pragra.learning.ms.coursems.controller;

import io.pragra.learning.ms.coursems.entity.Course;
import io.pragra.learning.ms.coursems.repo.CourseRepo;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
@Data
public class CourseController {
    private final  CourseRepo repo;

    @PostMapping("/")
    public Course create(@RequestBody Course course) {
        return repo.save(course);
    }

    @GetMapping("/")
    public List<Course> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{courseId}")
    public Optional<Course> find(@PathVariable Long id) {
        return repo.findById(id);
    }

}
