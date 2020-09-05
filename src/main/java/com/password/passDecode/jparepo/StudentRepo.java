package com.password.passDecode.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.password.passDecode.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
