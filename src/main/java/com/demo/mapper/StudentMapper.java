package com.demo.mapper;

import com.demo.pojo.Student;
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
public interface StudentMapper {
    /**
     * 添加学生
     * @param name
     * @param sex
     * @param grade
     * @return
     */
    @Insert("insert into student(stud_name,sex,grade) values(#{name},#{sex},#{grade})")
    void insertStudent(@Param("name") String name,@Param("sex") byte sex,@Param("grade") int grade);

    /**
     * 根据id修改学生
     * @param id
     * @param name
     * @param sex
     * @param grade
     */
    @Update("update student set stud_name=#{name},sex=#{sex},grade=#{grade} where id=#{id}")
    void updateStudent(@Param("id") long id,@Param("name") long name,@Param("sex") long sex,@Param("grade") long grade);

    /**
     * 模糊查询：根据姓名查询学生
     * @param name
     * @return
     */
    @Select("select * from student where stud_name like concat('%',#{name},'%')")
    List<Student> FuzzyQueryByName(String name);

    /**
     * 根据性别查询学生
     * @param sex
     * @return
     */
    @Select("select * from student where sex=#{sex}")
    List<Student> findBySex(byte sex);

    /**
     * 根据年级查询学生
     * @param grade
     * @return
     */
    @Select("select * from student where grade=#{grade}")
    List<Student> findByGrade(int grade);

    /**
     * 根据id删除学生
     * @param id
     */
    @Delete("delete from student where id = #{id}")
    void deleteById(long id);


}
