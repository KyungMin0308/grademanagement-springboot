package com.kyungmin.grademanagement.repository;

import com.kyungmin.grademanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/*
기능 목록(CRUD)
  1. Create
    1)다음 학기 예상 수강 과목 추가

  2. Read
    1)전체 과목 조회
    2)학기별 과목 조회

  3. Update
    1)다음 학기 예상 수강 과목 수정

  4. Delete
    1)과목 삭제
*/
public interface CourseRepository extends JpaRepository<Course, Integer> { //DAO 클래스

    //과목명으로 조회
    Course findBySubject(String subject);
}
