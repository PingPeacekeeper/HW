package com.example.controller;

import com.example.pojo.dto.StudentResponseDTO;
import com.example.pojo.entity.Student;
import com.example.service.StudentService;
import com.example.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl service) {
        studentService = service;
    }

    @GetMapping("/getAll")
    public StudentResponseDTO getALl() {
        List<StudentResponseDTO.StudentDTO> ls = new ArrayList<>();
        studentService.getAll().forEach(stu -> ls.add(new StudentResponseDTO.StudentDTO(stu)));
        return new StudentResponseDTO(ls);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentByID(@PathVariable Integer id) {
        Student student = studentService.getByID(id);
        if (student == null) {
            return new ResponseEntity<>(new StudentResponseDTO(new ArrayList<>()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new StudentResponseDTO(List.of(new StudentResponseDTO.StudentDTO(student))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteStudentByID(@PathVariable Integer id) {
        return new ResponseEntity<>(studentService.deleteByID(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<StudentResponseDTO> createStudent(@RequestBody Student student) {
        Student stu = studentService.create(student);
        return new ResponseEntity<>(new StudentResponseDTO(List.of(new StudentResponseDTO.StudentDTO(stu))), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<StudentResponseDTO> updateStudent(@RequestBody Student student) {

        studentService.update(student);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
