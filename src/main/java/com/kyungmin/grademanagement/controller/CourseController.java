package com.kyungmin.grademanagement.controller;

import com.kyungmin.grademanagement.dto.YearAndSemesterProjection;
import com.kyungmin.grademanagement.model.Course;
import com.kyungmin.grademanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CourseController {

    private int [] year = { 2016, 2019, 2020, 2021 };
    private int [] semester = { 1, 2 };

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    //Read 기능
    //1. 모든 교과목 조회
    @RequestMapping("/all_courses")
    public String showAllCourse(Model model) {
        List<Course> courseList = courseService.getAllCourse();
        model.addAttribute("courseList", courseList);

        return "all_courses"; //View name
    }

    //2. 학기별 이수 학점 조회
    @RequestMapping("/semester_course")
    public String showSemesterCourse(Model model) {
        List<Course> courseList = new ArrayList<>();

        for(int i=0; i<year.length; i++) {
            for(int j=0; j<semester.length; j++) {
                if(year[i] == 2021 && semester[j] == 2) break; //2021년 2학기 정보는 DB에 존재하지 않음

                YearAndSemesterProjection ysp = courseService.getSemesterCourse(year[i], semester[j]); //학기별 이수 학점을 DB 쿼리를 통해 반환
                courseList.add(Course.builder().year(ysp.getYear()).semester(ysp.getSemester()).credit(ysp.getCredit()).build()); //리스트에 추가
            }
        }

        model.addAttribute("courseList", courseList);

        return "semester_course";
    }

    //2-1. 해당 학기 수강과목 및 성적 조회
}
