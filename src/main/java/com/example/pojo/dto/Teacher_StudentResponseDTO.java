package com.example.pojo.dto;

import com.example.pojo.entity.Teacher_Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Teacher_StudentResponseDTO {
    private List<Teacher_StudentDTO> list;

    @Data
    @NoArgsConstructor
    public static class Teacher_StudentDTO {
        private int SID;
        private int TID;
        private String SName;
        private String TName;

        public Teacher_StudentDTO(Teacher_Student ts) {
            this.SID = ts.getStudent().getSID();
            this.TID = ts.getTeacher().getTID();
            this.SName = ts.getStudent().getSName();
            this.TName = ts.getTeacher().getTName();
        }
    }
}
