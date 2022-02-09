package com.orlov.evgeny.project.group_students.controlle;

import com.orlov.evgeny.project.group_students.dto.AddGroupDto;
import com.orlov.evgeny.project.group_students.dto.GetGroupByIdDto;
import com.orlov.evgeny.project.group_students.dto.GetGroupDto;
import com.orlov.evgeny.project.group_students.entity.Group;
import com.orlov.evgeny.project.group_students.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @PostMapping("/add")
    public void addGroup(@RequestBody AddGroupDto addGroupDto) {

        groupService.add(addGroupDto);
    }

    @GetMapping("/get")
    public List<GetGroupDto> get() {
        return groupService.get();
    }

    @GetMapping("/get/{id}")
    public GetGroupByIdDto getId(@PathVariable Long id) {
       return groupService.getGroupId(id);
    }

}
