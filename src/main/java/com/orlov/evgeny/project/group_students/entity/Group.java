package com.orlov.evgeny.project.group_students.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "university_group")
@Getter
@Setter
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true,length = 20)
    private String name;

    @Column(name = "create_at")
    private LocalDate createAt;

    @OneToMany(mappedBy = "group")
    @ToString.Exclude
    Set<Student> students;


}
