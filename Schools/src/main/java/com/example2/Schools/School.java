package com.example2.Schools;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class School {
    @Id
    private String school_id;
    private String school_name;
    private List<ClassDetails> classDetails;

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public List<ClassDetails> getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(List<ClassDetails> classDetails) {
        this.classDetails = classDetails;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}


