package com.orlov.evgeny.project.group_students.repository;

import com.orlov.evgeny.project.group_students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
