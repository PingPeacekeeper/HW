package com.example.service.impl;

import com.example.pojo.entity.Student;
import com.example.pojo.entity.Teacher;
import com.example.repositories.TeacherRepository;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    TeacherRepository repository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository repo) {
        repository = repo;
    }

    @Override
    public Iterable<Teacher> getAll() {
        return repository.findAll();
    }

    @Override
    public Teacher getByID(int id) {
        Optional<Teacher> teacher = repository.findById(id);
        return teacher.orElse(null);
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Boolean deleteByID(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return repository.save(teacher);
    }

    @Override
    public Teacher create(Teacher teacher) {
        return repository.save(teacher);
    }
}
