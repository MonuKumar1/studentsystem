package com.devmonu.studentsystem.service;

import com.devmonu.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    List<Student> getAllStudents();
}
