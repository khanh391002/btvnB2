package com.example.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {
	@Autowired
	StudentService studentService;

	public static void main(String[] args) {

		SpringApplication.run(StudentApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Class clas = new Class("12D1","Khanh");
		Student student = new Student("4","Khánh","Hà Nội",20);
		student.setClas(clas.getClassName());
//		Scanner sc = new Scanner(System.in);
////		studentService.saveStudent();
//		System.out.print("Nhap ten: ");
//		String name = sc.nextLine();
//		System.out.print("Nhap địa chỉ: ");
//		String address = sc.nextLine();
		List<Student> studentList;
		studentList = studentService.findAllByName("Khánh");
//		studentList = studentService.findAllByNameAndAddress(name, address);
//
		for (int i = 0; i< studentList.size(); i++){
			System.out.println(studentList.get(i).toString());
		}
	}
}