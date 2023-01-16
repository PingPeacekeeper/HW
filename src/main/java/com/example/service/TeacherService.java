package com.example.service;

import com.example.pojo.entity.Teacher;

public interface TeacherService {

    Iterable<Teacher> getAll();

    Teacher getByID(int id);

    Boolean deleteByID(int id);

    Teacher update(Teacher teacher);

    Teacher create(Teacher teacher);

}
