package com.demo.pojo;

/**
 * @anther 龙泽国
 */

/**
 * 课程
 */
public class Course {
    private long id;
    private String course_name;//课程名
    private float credit;//学分

    public Course() {
    }

    public Course(long id, String course_name, float credit) {
        this.id = id;
        this.course_name = course_name;
        this.credit = credit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
