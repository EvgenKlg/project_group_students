package com.orlov.evgeny.project.group_students.service;

import com.orlov.evgeny.project.group_students.dto.AddGroupDto;
import com.orlov.evgeny.project.group_students.dto.GetGroupByIdDto;
import com.orlov.evgeny.project.group_students.dto.GetGroupDto;

import java.util.List;

public interface GroupService {


    void add(AddGroupDto addGroupDto);

    List<GetGroupDto> get();


    GetGroupByIdDto getGroupId(Long id);


}
