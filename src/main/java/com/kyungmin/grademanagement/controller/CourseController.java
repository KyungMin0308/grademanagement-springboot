package com.kyungmin.grademanagement.controller;

import com.kyungmin.grademanagement.model.Course;
import com.kyungmin.grademanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    //1. 모든 교과목 조회
    @RequestMapping("/all_courses")
    public String showAllCourse(Model model) {
        List<Course> courseList = courseService.getAllCourse();
        model.addAttribute("courseList", courseList);

        return "all_courses"; //View name
    }
}
