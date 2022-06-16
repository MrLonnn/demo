package com.demo.mapper;

import com.demo.pojo.Score;
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
public interface ScoreMapper {
    /**
     * 根据学生id查询该生所有课程对应成绩
     * @param sid
     * @return
     */
    @Select("select * from score where sid=#{sid}")
    List<Score> findBySid(long sid);

    /**
     * 根据课程id查询该课程的所有学生成绩
     * @param cid
     * @return
     */
    @Select("select * from score where cid=#{cid}")
    List<Score> findByCid(long cid);

    /**
     * 添加数据进成绩表
     * @param sid
     * @param cid
     * @param degree
     */
    @Insert("insert into score(sid,cid,degree) values(#{sid},#{cid},#{degree})")
    void insertScore(@Param("sid") long sid, @Param("cid") long cid, @Param("degree") float degree);

    /**
     * 根据sid删除学生成绩记录
     * @param sid
     */
    @Delete("delete from score where sid = #{sid}")
    void deleteBySid(long sid);

    /**
     * 根据cid删除学生成绩记录
     * @param cid
     */
    @Delete("delete from score where cid = #{cid}")
    void deleteByCid(long cid);
}
