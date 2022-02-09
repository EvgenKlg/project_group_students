package com.orlov.evgeny.project.group_students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetGroupByIdDto {

    private Long id;
    private String name;
    List<StudentResponseDto> students;

}
