package com.battlegao.library.domain;

import org.omg.CORBA.TIMEOUT;

import java.util.Date;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */

public class Student {
    private Long id;
    private String studentName;
    private Integer studentNum;
    private Integer studentGender;
    private String studentClasses;
    private Date createTime;
    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Integer studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentClasses() {
        return studentClasses;
    }

    public void setStudentClasses(String studentClasses) {
        this.studentClasses = studentClasses;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNum=" + studentNum +
                ", studentGender=" + studentGender +
                ", studentClasses='" + studentClasses + '\'' +
                '}';
    }
}
