package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentReponsitory extends JpaRepository<Student,String> {
    List<Student> findAllByName(String name);

    List<Student> findAllByAddress(String address);

    @Query("select st from Student st where st.name = :name and st.address = :address")
    List<Student> findAllByNameAndAddress(@Param("name") String name, @Param("address") String address);

}
