package com.example.pojo.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "Teacher_student")
@Data
public class Teacher_Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TS_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SID")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="TID")
    private Teacher teacher;

}
