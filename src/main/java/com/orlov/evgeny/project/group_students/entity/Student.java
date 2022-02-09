package com.orlov.evgeny.project.group_students.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "create_at")
    private LocalDate creatAt;

    @ManyToOne()
    @JoinColumn(name = "group_id",foreignKey = @ForeignKey(name = "student_fk_group "))
    private Group group;


}
