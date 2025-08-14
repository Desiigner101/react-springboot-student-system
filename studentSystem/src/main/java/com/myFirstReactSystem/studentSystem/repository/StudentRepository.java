package com.myFirstReactSystem.studentSystem.repository;

import com.myFirstReactSystem.studentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
