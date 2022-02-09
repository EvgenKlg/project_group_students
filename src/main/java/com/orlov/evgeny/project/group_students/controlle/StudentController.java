package com.orlov.evgeny.project.group_students.controlle;

import com.orlov.evgeny.project.group_students.dto.AddStudentDto;
import com.orlov.evgeny.project.group_students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public void add(@RequestBody AddStudentDto studentDto){

        studentService.add(studentDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.delete(id);
    }




}
