package service;

import model.Student;

import java.util.List;

public interface IstudentService {
    List<Student> findAll();

    Student findById(Long id);

}
