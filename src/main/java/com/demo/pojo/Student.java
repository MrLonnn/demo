package com.demo.pojo;

/**
 * @anther 龙泽国
 */

/**
 * 学生信息
 */
public class Student {
    private long id;
    private String stud_name;//姓名
    private byte sex;//性别
    private int grade;//年级

    public Student() {
    }

    public Student(long id, String stud_name, byte sex, int grade) {
        this.id = id;
        this.stud_name = stud_name;
        this.sex = sex;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stud_name='" + stud_name + '\'' +
                ", sex=" + sex +
                ", grade=" + grade +
                '}';
    }
}
