package com.example.pojo.dto;

import com.example.pojo.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class TeacherResponseDTO {
    private List<TeacherDTO> list;

    @Data
    @RequiredArgsConstructor
    public static class TeacherDTO {
        private int TID;
        private String TName;
        private String Display;

        public TeacherDTO(Teacher teacher) {
            this.TID = teacher.getTID();
            this.TName = teacher.getTName();
            this.Display = teacher.getDisplay();
        }
    }
}
