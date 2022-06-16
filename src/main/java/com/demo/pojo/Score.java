package com.demo.pojo;

/**
 * @anther 龙泽国
 */

/**
 * 学生成绩类
 */
public class Score {
    private long id;
    private long sid;//学生id
    private long cid;//课程id
    private float degree;//成绩

    public Score() {
    }

    public Score(long id, long sid, long cid, float degree) {
        this.id = id;
        this.sid = sid;
        this.cid = cid;
        this.degree = degree;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public float getDegree() {
        return degree;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", sid=" + sid +
                ", cid=" + cid +
                ", degree=" + degree +
                '}';
    }
}
