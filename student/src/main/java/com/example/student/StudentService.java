package com.example.student;

import java.util.List;

public interface StudentService {
    void saveStudent();
    void findAllById();

    List<Student> findAllByName(String name);
    List<Student> findAllByAddress(String address);
    List<Student> findAllByNameAndAddress(String name, String address);
}