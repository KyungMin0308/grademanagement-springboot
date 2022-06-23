package com.kyungmin.grademanagement.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "course_info")
public class Course { //과목 클래스

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //DB에서 Course를 구분하기 위한 ID

    private int year; //수강년도
    
    private int semester; //학기

    @Size(min = 2, max = 100, message = "과목명은 최소 2글자, 최대 100글자입니다.")
    @NotEmpty(message = "과목명은 반드시 입력해야 합니다.")
    private String subject; //과목명

    @NotEmpty(message = "교과구분은 반드시 입력해야 합니다.(전공 or 교양)")
    private String curriculum; //교과구분

    @Min(1)
    @Max(3)
    private int credit; //학점

    private String grade; //성적

    public Course(int year, int semester, String subject, String curriculum, int credit, String grade) {
        this.year = year;
        this.semester = semester;
        this.subject = subject;
        this.curriculum = curriculum;
        this.credit = credit;
        this.grade = grade;
    }
}
