package io.pragra.learning.ms.coursems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
    @GetMapping("/course/module")
    public String getModule(){
        return "This is the module";
    }
}
