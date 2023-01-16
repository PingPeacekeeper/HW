package com.example.pojo.dto;

import com.example.pojo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentResponseDTO {
    private List<StudentDTO> list;

    @Data
    @RequiredArgsConstructor
    public static class StudentDTO{
        private int SID;
        private String SName;
        private String Display;

        public StudentDTO(Student student){
            this.SID=student.getSID();
            this.SName=student.getSName();
            this.Display=student.getDisplay();
        }
    }


}
