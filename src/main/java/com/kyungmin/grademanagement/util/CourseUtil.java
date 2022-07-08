package com.kyungmin.grademanagement.util;

import com.kyungmin.grademanagement.model.Course;
import org.springframework.stereotype.Component;

import java.util.List;

//Thymeleaf에서 사용할 Course 관련 유틸 함수 작성 클래스
@Component
public class CourseUtil {

    //평균 평점 계산
    public double getAvgGrade(List<Course> courseList) {
        int count = courseList.size(); //과목수
        double totalCredit = 0.0; //총 이수 학점
        double avgGrade = 0.0; //평균 평점

        //학점을 기준으로 총 이수 학점 계산
        for(Course course: courseList) {
            String grade = course.getGrade();

            if(grade.equals("A+")) totalCredit += 4.5;
            else if(grade.equals("A0")) totalCredit += 4.0;
            else if(grade.equals("B+")) totalCredit += 3.5;
            else if(grade.equals("B0")) totalCredit += 3.0;
            else if(grade.equals("C+")) totalCredit += 2.5;
            else if(grade.equals("C0")) totalCredit += 2.0;
            else if(grade.equals("D+")) totalCredit += 1.5;
            else if(grade.equals("D0")) totalCredit += 1.0;
            else totalCredit += 0.0;
        }

        avgGrade = totalCredit / count; //평균 평점 계산
        avgGrade = Math.ceil(avgGrade*100) / 100.0; //평균 평점 소수점 아래 2자리까지 올림

        return avgGrade;
    }

}
