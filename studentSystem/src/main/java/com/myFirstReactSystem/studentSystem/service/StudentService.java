package com.myFirstReactSystem.studentSystem.service;

import com.myFirstReactSystem.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
