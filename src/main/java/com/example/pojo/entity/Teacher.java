package com.example.pojo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Teacher")
@Getter
@Setter
@RequiredArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TID")
    private int TID;

    @Column(name = "TName")
    private String TName;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Teacher_Student> list;

    @Column(name = "Display")
    private String display;

    @Column(name = "Hidden")
    private String hidden;

    public Teacher(String name) {
        this.TName = name;
        hidden = "hidden text";
        display = "shown text";
    }

    @Override
    public String toString() {
        return "Teacher{" + "TID=" + TID + ", TName='" + TName + '\'' + '}';
    }
}
