package com.example.service.impl;

import com.example.pojo.entity.Student;
import com.example.pojo.entity.Teacher;
import com.example.pojo.entity.Teacher_Student;
import com.example.repositories.TeacherRepository;
import com.example.repositories.TeacherStudentRepository;
import com.example.service.TeacherStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherStudentServiceImpl implements TeacherStudentService {
    TeacherStudentRepository repository;

    @Autowired
    public TeacherStudentServiceImpl(TeacherStudentRepository repo) {
        repository = repo;
    }

    @Override
    public Iterable<Teacher_Student> findByStudent(Student student) {
        return repository.findByStudent(student);
    }

    @Override
    public Iterable<Teacher_Student> findByTeacher(Teacher teacher) {
        return repository.findByTeacher(teacher);
    }

    @Override
    public Teacher_Student findByTeacherAndStudent(Teacher teacher, Student student) {
        return repository.findByTeacherAndStudent(teacher, student);
    }
}
