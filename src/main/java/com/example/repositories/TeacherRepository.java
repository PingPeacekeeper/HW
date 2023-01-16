package com.example.repositories;

import com.example.pojo.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher,Integer> {

}
