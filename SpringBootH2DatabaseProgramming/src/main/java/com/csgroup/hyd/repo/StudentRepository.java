package com.csgroup.hyd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csgroup.hyd.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
