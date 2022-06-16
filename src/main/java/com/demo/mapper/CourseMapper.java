package com.demo.mapper;

import com.demo.pojo.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @anther 龙泽国
 */
/**
 * 删除方法在测试类！！！！！！
 */
@Mapper
@Repository
public interface CourseMapper {
    /**
     * 根据课程名模糊查询
     * @param name
     * @return
     */
    @Select("select * from course where course_name like concat('%',#{name},'%')")
    List<Course>  FuzzyQueryByName(String name);

    /**
     * 添加课程
     * @param name
     * @param credit
     */
    @Insert("insert into course(course_name,credit) values(#{name},#{credit})")
    void  insertCourse(@Param("name") String name,@Param("credit") float credit);

    /**
     * 课程的修改
     * @param name
     * @param credit
     * @param id
     */
    @Update("update course set course_name=#{name},credit=#{credit} where id=#{id}")
    void updateCourse(@Param("name") String name,@Param("credit") float credit,@Param("name") long id);

    /**
     * 根据id删除课程
     * @param id
     */
    @Delete("delete from course where id=#{id}")
    void deleteCourse(long id);
}
