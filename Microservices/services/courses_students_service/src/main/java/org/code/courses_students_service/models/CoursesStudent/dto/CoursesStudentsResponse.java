package org.code.courses_students_service.models.CoursesStudent.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CoursesStudentsResponse {

    private String studentDocumentNumber;
    private String courseId;
    private String yearEntry;
    private String isGraduated;

    @Override
    public String toString() {
        return "CoursesStudentsResponse {" +
                "studentDocumentNumber='" + studentDocumentNumber + '\'' +
                ", courseId='" + courseId + '\'' +
                ", yearEntry='" + yearEntry + '\'' +
                ", isGraduated='" + isGraduated + '\'' +
                '}';
    }
}
