package com.orlov.evgeny.project.group_students.service;

import com.orlov.evgeny.project.group_students.dto.AddGroupDto;
import com.orlov.evgeny.project.group_students.dto.GetGroupByIdDto;
import com.orlov.evgeny.project.group_students.dto.GetGroupDto;
import com.orlov.evgeny.project.group_students.dto.StudentResponseDto;
import com.orlov.evgeny.project.group_students.entity.Group;
import com.orlov.evgeny.project.group_students.entity.Student;
import com.orlov.evgeny.project.group_students.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;

    @Override
    public void add(AddGroupDto addGroupDto) {

        Group group = new Group();
        group.setName(addGroupDto.getName());
        group.setCreateAt(LocalDate.now());

        groupRepository.save(group);
    }

    @Override
    public List<GetGroupDto> get() {

       return groupRepository.findAll().stream()
               .map(group -> {
                   GetGroupDto getGroupDto = new GetGroupDto();
                   getGroupDto.setName(group.getName());
                   getGroupDto.setQuantity(group.getStudents().size());
                   getGroupDto.setId(group.getId());
                   return getGroupDto;
               }).collect(Collectors.toList());


    }

    @Override
    public GetGroupByIdDto getGroupId(Long id) {
        Group group = groupRepository.getById(id);
        GetGroupByIdDto getGroupByIdDto = new GetGroupByIdDto();
        getGroupByIdDto.setName(group.getName());
        getGroupByIdDto.setId(group.getId());

        Set<Student> students = group.getStudents();

        List<StudentResponseDto> collect = students.stream().map(student -> {
            StudentResponseDto studentResponseDto = new StudentResponseDto();
            studentResponseDto.setName(student.getName());
            studentResponseDto.setId(student.getId());
            studentResponseDto.setDate(student.getCreatAt());
            return studentResponseDto;
        }).collect(Collectors.toList());

        getGroupByIdDto.setStudents(collect);
        return getGroupByIdDto;
    }




}
