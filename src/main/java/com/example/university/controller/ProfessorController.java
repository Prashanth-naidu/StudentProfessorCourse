
package com.example.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import com.example.university.model.*;
import com.example.university.service.*;
import java.util.*;

@RestController
public class ProfessorController {

    @Autowired

    private ProfessorJpaService js;

    @GetMapping("/professor")
    public ArrayList<Professor> getProfessors() {
        return js.getProfessors();
    }

    @PostMapping("/professor")
    public Professor addProfessor(@RequestBody Professor professor) {
        return js.addProfessor(professor);
    }

    @GetMapping("/professor/{professorId}")
    public Professor getProfessorById(@PathVariable("professorId") int professorId) {
        return js.getProfessorById(professorId);
    }

    @PutMapping("/professor/{professorId}")
    public Professor updateProfessor(@PathVariable("professorId") int professorId, @RequestBody Professor professor) {
        return js.updateProfessor(professorId, professor);
    }

    @DeleteMapping("/professor/{professorId}")
    public void deleteProfessor(@PathVariable("professorId") int professorId) {
        js.deleteProfessor(professorId);
    }

    @GetMapping("/professor/{professorId}/courses")
    public List<Course> getProfessorCourses(@PathVariable("professorId") int professorId) {
        return js.getProfessorCourses(professorId);
    }
}
