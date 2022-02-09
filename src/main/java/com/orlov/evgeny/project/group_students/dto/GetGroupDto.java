package com.orlov.evgeny.project.group_students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetGroupDto {

    private String name;
    private int quantity;
    private Long id;
}
