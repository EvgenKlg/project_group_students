package com.orlov.evgeny.project.group_students.service;

import com.orlov.evgeny.project.group_students.dto.AddStudentDto;

public interface StudentService {


    void add(AddStudentDto studentDto);

    void delete(Long id);
}

