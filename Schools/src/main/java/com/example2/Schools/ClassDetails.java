package com.example2.Schools;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassDetails {
    private String class_code;
    private String class_name;
    private String student_strength;
    private String instructor_code;

    public String getClass_code() {
        return class_code;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getInstructor_code() {
        return instructor_code;
    }

    public void setInstructor_code(String instructor_code) {
        this.instructor_code = instructor_code;
    }

    public String getStudent_strength() {
        return student_strength;
    }

    public void setStudent_strength(String student_strength) {
        this.student_strength = student_strength;
    }
}
