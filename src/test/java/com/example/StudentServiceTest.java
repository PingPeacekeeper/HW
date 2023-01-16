package com.example;

import com.example.pojo.entity.Student;
import com.example.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class StudentServiceTest {
    @Autowired
    StudentServiceImpl studentService;

    @Test
    public void testInsert() {
        Student student = new Student();
        student.setSName("TestName");
        student.setHidden("hidden msg");
        student.setDisplay("display msg");
        System.out.println(studentService.create(student));
    }

    @Test
    public void testGetAll() {
        System.out.println(studentService.getAll());
    }

    @Test
    public void testGetOne() {
        Iterator<Student> iterator = studentService.getAll().iterator();
        int id = iterator.next().getSID();
        System.out.println(studentService.getByID(id));
    }

    @Test
    public void testUpdate() {
        Student student = studentService.getAll().iterator().next();
        student.setSName("new Name");
        System.out.println(studentService.update(student));
    }

    @Test
    public void testDelete() {
        Student student = studentService.getAll().iterator().next();
        System.out.println(studentService.deleteByID(student.getSID()));
    }

}
