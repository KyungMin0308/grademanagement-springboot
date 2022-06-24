package com.kyungmin.grademanagement.service;

import com.kyungmin.grademanagement.model.Course;
import com.kyungmin.grademanagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    //생성자 의존성 주입
    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    //1. Create
    public void insert(Course course) {
        courseRepository.save(course);
    }

    //2. Read
    //1)모든 Course 조회
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    //3. Update
    //1)과목명, 교과구분, 학점 수정
    public void update(String subject, String curriculum, int credit) {
        Course course = courseRepository.findBySubject(subject); //과목명으로 Course 객체 가져오기
        int id = course.getId(); //ID(기본키) 가져오기
        courseRepository.save(Course.builder().id(id).subject(subject).curriculum(curriculum).credit(credit).build());
    }

    //4. Delete
    //1)과목 삭제
    public void delete(int id) { courseRepository.deleteById(id); }



}
