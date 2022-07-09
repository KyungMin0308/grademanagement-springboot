package com.kyungmin.grademanagement;

import com.kyungmin.grademanagement.dto.YearAndSemesterProjection;
import com.kyungmin.grademanagement.model.Course;
import com.kyungmin.grademanagement.repository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void getTotalCreditByYearAndSemester() { //수강년도, 학기별 총 이수학점 조회
        YearAndSemesterProjection ysp = courseRepository.findTotalCreditByYearAndSemester(2016, 1);
        System.out.println(ysp.getYear());
        System.out.println(ysp.getSemester());
        System.out.println(ysp.getCredit());
    }

    @Test
    public void getCourseByYearAndSemester() { //해당 년도와 학기에 수강한 과목 정보 조회
        List<Course> courseList = courseRepository.findByYearAndSemester(2016, 1);
        for(Course course: courseList) {
            System.out.println(course.getYear() + " " + course.getSemester() + " " + course.getSubject() + " "
                    + course.getCurriculum() + " " + course.getCredit() + " " + course.getGrade());
        }
    }
}
