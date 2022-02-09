package com.orlov.evgeny.project.group_students.service;

import com.orlov.evgeny.project.group_students.dto.AddStudentDto;
import com.orlov.evgeny.project.group_students.dto.StudentResponseDto;
import com.orlov.evgeny.project.group_students.entity.Group;
import com.orlov.evgeny.project.group_students.entity.Student;
import com.orlov.evgeny.project.group_students.repository.GroupRepository;
import com.orlov.evgeny.project.group_students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    GroupRepository groupRepository;


    @Override
    public void add(AddStudentDto studentDto) {

        Student student = new Student();
        student.setName(studentDto.getName());
        student.setCreatAt(LocalDate.now());
        Group group = groupRepository.findById(studentDto.getId()).get();
        student.setGroup(group);
        studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        Student student = new Student();
        student.setId(id);
        studentRepository.delete(student);
    }
}
