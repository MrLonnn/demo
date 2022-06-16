package com.demo;

import com.demo.mapper.CourseMapper;
import com.demo.mapper.ScoreMapper;
import com.demo.mapper.StudentMapper;
import com.demo.pojo.Course;
import com.demo.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Test
    void contextLoads() {
        List<Student> all = studentMapper.findByGrade(1);
        for (Student student : all) {
            System.out.println(student);
        }
    }

    //删除
    //删除学生必须先删除与课程关联的成绩表中的数据
    public void deleteStudent(long sid){
        scoreMapper.deleteBySid(sid);
        studentMapper.deleteById(sid);
    }

    //删除课程必须先删除成绩表中的有学生在使用的数据
    public void deleteCourse(long cid){
        scoreMapper.deleteByCid(cid);
        courseMapper.deleteCourse(cid);
    }

}
