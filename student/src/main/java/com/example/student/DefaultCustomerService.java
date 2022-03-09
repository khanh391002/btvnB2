package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCustomerService implements StudentService{
    @Autowired
    StudentReponsitory studentReponsitory;

    public void saveStudent(){
        studentReponsitory.save(new Student("3","KhanhSmile","Hà Nội",21));
    }

    @Override
    public void findAllById() {

    }

    @Override
    public List<Student> findAllByName(String name) {
        List<Student> listName = studentReponsitory.findAllByName(name);
        return listName;
    }


    @Override
    public List<Student> findAllByAddress(String address) {
        List<Student> listAdd = studentReponsitory.findAllByAddress(address);
        return listAdd;
    }

    @Override
    public List<Student> findAllByNameAndAddress(String name, String address) {
        List<Student> studentList = studentReponsitory.findAllByNameAndAddress(name,address);
        return studentList;
    }
}
