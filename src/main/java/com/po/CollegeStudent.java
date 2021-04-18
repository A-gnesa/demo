package com.po;

import org.springframework.stereotype.Repository;

@Repository("CollegeStudent")
public class CollegeStudent implements Student{
    private String stuName;
    private String stuNo;
    private Integer score;

    public CollegeStudent() {
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", score=" + score +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public CollegeStudent(String stuName, String stuNo, Integer score) {
        this.stuName = stuName;
        this.stuNo = stuNo;
        this.score = score;
    }

    @Override
    public void selectStu() {
        System.out.println("查找用户成功");
    }

    @Override
    public void insertStu() {
        System.out.println("添加用户成功");
    }
}
