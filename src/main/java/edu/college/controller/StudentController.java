
package edu.college.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/api/students")
    public Map<String, String> getStudents() {
        return Map.of(
                "student", "Student API is working!",
                "status", "success"
        );
    }

    @GetMapping("/api/version")
    public Map<String, String> getVersion() {
        return Map.of(
                "version", "v2",
                "status", "canary"
        );
    }
}
