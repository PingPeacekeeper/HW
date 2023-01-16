package com.example.service;

import com.example.pojo.entity.Student;
import com.example.pojo.entity.Teacher;
import com.example.pojo.entity.Teacher_Student;

public interface TeacherStudentService {
    Iterable<Teacher_Student> findByStudent(Student student);
    Iterable<Teacher_Student> findByTeacher(Teacher teacher);
    Teacher_Student findByTeacherAndStudent(Teacher teacher,Student student);
}
