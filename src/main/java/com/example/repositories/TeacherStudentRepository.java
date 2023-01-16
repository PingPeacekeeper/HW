package com.example.repositories;

import com.example.pojo.entity.Student;
import com.example.pojo.entity.Teacher;
import com.example.pojo.entity.Teacher_Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherStudentRepository extends CrudRepository<Teacher_Student, Integer> {

    @Query("From Teacher_Student where Teacher =? 1")
    List<Teacher_Student> findByTeacher(Teacher teacher);

    @Query("From Teacher_Student where Student =? 1")
    List<Teacher_Student> findByStudent(Student student);

    @Query("From Teacher_Student where Teacher =?1 and Student =?2")
    Teacher_Student findByTeacherAndStudent(Teacher teacher, Student student);

}
