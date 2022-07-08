package com.kyungmin.grademanagement.dto;

//학기별 이수 학점을 가져오기 위한 DTO
public interface YearAndSemesterProjection {
    Integer getYear(); //연도
    Integer getSemester(); //학기
    Integer getCredit(); //총 이수 학점
}
