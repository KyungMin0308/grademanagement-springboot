package com.kyungmin.grademanagement;

import com.kyungmin.grademanagement.model.Course;
import com.kyungmin.grademanagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements ApplicationRunner {

    private CourseRepository courseRepository;

    //생성자 의존성 주입
    @Autowired
    public MyAppRunner(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //2016년도 1학기
        Course course1 = new Course(2016, 1, "컴퓨터프로그래밍1", "전공", 3, "B0");
        Course course2 = new Course(2016, 1, "이산수학", "전공", 3, "A+");
        Course course3 = new Course(2016, 1, "운동과 건강", "교양", 2, "A+");
        Course course4 = new Course(2016, 1, "기초공학수학", "교양", 2, "A+");
        Course course5 = new Course(2016, 1, "영어커뮤니케이션 청취/회화 II", "교양", 2, "A0");
        Course course6 = new Course(2016, 1, "소프트웨어의 이해", "교양", 2, "B+");
        Course course7 = new Course(2016, 1, "사고와 표현I", "교양", 2, "B+");

        //2016년도 2학기
        Course course8 = new Course(2016, 2, "컴퓨터프로그래밍2", "전공", 3, "C+");
        Course course9 = new Course(2016, 2, "창의적공학설계", "전공", 3, "A0");
        Course course10 = new Course(2016, 2, "Word 및 Powerpoint 활용", "교양", 2, "B+");
        Course course11 = new Course(2016, 2, "디지털미디어의 이해와 실제", "교양", 2, "B+");
        Course course12 = new Course(2016, 2, "통계학", "교양", 2, "A+");
        Course course13 = new Course(2016, 2, "공학기술개론", "교양", 2, "B+");
        Course course14 = new Course(2016, 2, "영어커뮤니케이션 독해/작문 II", "교양", 2, "A+");
        Course course15 = new Course(2016, 2, "사고와 표현II", "교양", 2, "B+");

        //2019년도 1학기
        Course course16 = new Course(2019, 1, "객체지향언어1", "전공", 3, "A+");
        Course course17 = new Course(2019, 1, "자료구조", "전공", 3, "A+");
        Course course18 = new Course(2019, 1, "프로그래밍랩", "전공", 3, "B0");
        Course course19 = new Course(2019, 1, "지식재산입문", "교양", 3, "B+");
        Course course20 = new Course(2019, 1, "컴퓨터와 인터넷개론", "교양", 3, "A0");
        Course course21 = new Course(2019, 1, "멀티미디어와 현대사회", "교양", 3, "A+");

        //2019년도 2학기
        Course course22 = new Course(2019, 2, "객체지향언어2", "전공", 3, "A+");
        Course course23 = new Course(2019, 2, "데이터통신", "전공", 3, "A+");
        Course course24 = new Course(2019, 2, "알고리즘", "전공", 3, "A+");
        Course course25 = new Course(2019, 2, "빅데이터기초", "전공", 3, "A0");
        Course course26 = new Course(2019, 2, "게임그래픽&애니메이션", "전공", 3, "B+");
        Course course27 = new Course(2019, 2, "웹프로그래밍", "전공", 3, "B+");
        Course course28 = new Course(2019, 2, "리더십", "교양", 3, "B+");
        Course course29 = new Course(2019, 2, "4차 산업혁명과 현대조직", "교양", 3, "B+");

        //2020년도 1학기
        Course course30 = new Course(2020, 1, "데이터베이스", "전공", 3, "A0");
        Course course31 = new Course(2020, 1, "소프트웨어공학", "전공", 3, "A+");
        Course course32 = new Course(2020, 1, "운영체제", "전공", 3, "A0");
        Course course33 = new Course(2020, 1, "컴퓨터그래픽스", "전공", 3, "A+");
        Course course34 = new Course(2020, 1, "데이터마이닝", "전공", 3, "A0");
        Course course35 = new Course(2020, 1, "융복합적 사고와 글쓰기", "교양", 3, "A+");
        Course course36 = new Course(2020, 1, "Basic Career English", "교양", 3, "A+");

        //2020년도 2학기
        Course course37 = new Course(2020, 2, "시스템프로그래밍", "전공", 3, "A+");
        Course course38 = new Course(2020, 2, "네트워크프로그래밍", "전공", 3, "B+");
        Course course39 = new Course(2020, 2, "설계패턴", "전공", 3, "A+");
        Course course40 = new Course(2020, 2, "컴퓨터비전", "전공", 3, "A+");
        Course course41 = new Course(2020, 2, "고급모바일프로그래밍", "전공", 3, "A0");
        Course course42 = new Course(2020, 2, "웹프레임워크1", "전공", 3, "A+");
        Course course43 = new Course(2020, 2, "디자인Thinking", "교양", 3, "B+");

        //2021년도 1학기
        Course course44 = new Course(2021, 1, "정보보안", "전공", 3, "A+");
        Course course45 = new Course(2021, 1, "빅데이터프로그래밍", "전공", 3, "A+");
        Course course46 = new Course(2021, 1, "웹프레임워크2", "전공", 3, "A+");
        Course course47 = new Course(2021, 1, "역사와 문명", "교양", 3, "A+");

        //DB에 저장
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);
        courseRepository.save(course5);
        courseRepository.save(course6);
        courseRepository.save(course7);

        courseRepository.save(course8);
        courseRepository.save(course9);
        courseRepository.save(course10);
        courseRepository.save(course11);
        courseRepository.save(course12);
        courseRepository.save(course13);
        courseRepository.save(course14);
        courseRepository.save(course15);

        courseRepository.save(course16);
        courseRepository.save(course17);
        courseRepository.save(course18);
        courseRepository.save(course19);
        courseRepository.save(course20);
        courseRepository.save(course21);

        courseRepository.save(course22);
        courseRepository.save(course23);
        courseRepository.save(course24);
        courseRepository.save(course25);
        courseRepository.save(course26);
        courseRepository.save(course27);
        courseRepository.save(course28);
        courseRepository.save(course29);

        courseRepository.save(course30);
        courseRepository.save(course31);
        courseRepository.save(course32);
        courseRepository.save(course33);
        courseRepository.save(course34);
        courseRepository.save(course35);
        courseRepository.save(course36);

        courseRepository.save(course37);
        courseRepository.save(course38);
        courseRepository.save(course39);
        courseRepository.save(course40);
        courseRepository.save(course41);
        courseRepository.save(course42);
        courseRepository.save(course43);

        courseRepository.save(course44);
        courseRepository.save(course45);
        courseRepository.save(course46);
        courseRepository.save(course47);

    }
}
