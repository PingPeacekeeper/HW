package com.example.service;

import com.example.pojo.entity.Student;

public interface StudentService {
    Iterable<Student> getAll();

    Student getByID(int id);

    Boolean deleteByID(int id);

    Student update(Student student);

    Student create(Student student);
}
