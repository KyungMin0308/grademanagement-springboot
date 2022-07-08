package com.kyungmin.grademanagement.repository;

import com.kyungmin.grademanagement.dto.YearAndSemesterProjection;
import com.kyungmin.grademanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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

    //과목명으로 조회(Update에서 사용)
    Course findBySubject(String subject);

    //수강년도, 학기를 기준으로 수강년도, 학기, 이수 학점을 조회(Read에서 사용)
    @Query(value="select c.year AS year, c.semester AS semester, sum(c.credit) AS credit " +
            "from Course_Info c " +
            "where c.year = :year and c.semester = :semester " +
            "group by c.year, c.semester"
            , nativeQuery = true)
    YearAndSemesterProjection findTotalCreditByYearAndSemester(int year, int semester);

}
