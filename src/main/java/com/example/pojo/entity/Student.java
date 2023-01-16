package com.example.pojo.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
@Getter
@Setter
@RequiredArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SID")
    private int SID;

    @Column(name = "SName")
    private String SName;


    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Teacher_Student> list;

    @Column(name = "Display")
    private String display;

    @Column(name = "Hidden")
    private String hidden;

    public Student(String name) {
        this.SName = name;
        hidden = "hidden text";
        display = "shown text";
    }

    @Override
    public String toString() {
        return "Student{" + "SID=" + SID + ", SName='" + SName + '\'' + '}';
    }

}
