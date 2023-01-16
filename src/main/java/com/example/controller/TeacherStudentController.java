package com.example.controller;

import com.example.pojo.dto.Teacher_StudentResponseDTO;
import com.example.pojo.entity.Student;
import com.example.service.impl.StudentServiceImpl;
import com.example.service.impl.TeacherServiceImpl;
import com.example.service.impl.TeacherStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teacher_student")
public class TeacherStudentController {
    TeacherStudentServiceImpl service;
    TeacherServiceImpl teacherService;
    StudentServiceImpl studentService;

    @Autowired
    public TeacherStudentController(TeacherStudentServiceImpl s1, TeacherServiceImpl s2, StudentServiceImpl s3) {
        service = s1;
        teacherService = s2;
        studentService = s3;
    }

    @GetMapping("/getTeacherByStudentID/{id}")
    public ResponseEntity<Teacher_StudentResponseDTO> getTeachersByStudentID(@PathVariable Integer id) {
        List<Teacher_StudentResponseDTO.Teacher_StudentDTO> res = new ArrayList<>();
        Student student = studentService.getByID(id);
        service.findByStudent(student).forEach(ts -> res.add(new Teacher_StudentResponseDTO.Teacher_StudentDTO(ts)));
        return new ResponseEntity<>(new Teacher_StudentResponseDTO(res), HttpStatus.OK);
    }


}
