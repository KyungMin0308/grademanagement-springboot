package com.kyungmin.grademanagement;

import com.kyungmin.grademanagement.dto.YearAndSemesterProjection;
import com.kyungmin.grademanagement.repository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    //DB에서 데이터를 제대로 읽어오는지 확인
    @Test
    public void getSemesterCourse() {
        YearAndSemesterProjection ysp = courseRepository.findTotalCreditByYearAndSemester(2016, 1);
        System.out.println(ysp.getYear());
        System.out.println(ysp.getSemester());
        System.out.println(ysp.getCredit());
    }
}
