package com.jcarloshg.restcrud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcarloshg.restcrud.entity.Student;
import com.jcarloshg.restcrud.rest.StudentNotFoundException;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRESTController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        this.students = new ArrayList<Student>();
        this.students.add(new Student("Rosa", "Pasten"));
        this.students.add(new Student("Alfredo", "Lopez"));
        this.students.add(new Student("John", "Smith"));
        this.students.add(new Student("Carl", "White"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudentByID(@PathVariable int studentID) {

        if (studentID >= this.students.size() || studentID < 0) {
            throw new StudentNotFoundException("the ID [" + studentID + "] not exist");
        }

        Student studentFounded = this.students.get(studentID);
        return studentFounded;

        // try {
        // Student studentFounded = this.students.get(studentID);
        // System.out.println(studentFounded.toString());
        // return studentFounded;
        // } catch (Exception e) {
        // throw new StubNotFoundException("the ID ["+studentID+"]" + "not exist");
        // }

    }

}
