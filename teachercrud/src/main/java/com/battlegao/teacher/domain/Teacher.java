package com.battlegao.teacher.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName teacher
 */
@TableName(value ="teacher")
@Data
public class Teacher implements Serializable {
    /**
     * 教师ID
     */
    @TableId(type = IdType.AUTO)
    private Long tId;

    /**
     * 教师姓名
     */
    private String tName;

    /**
     * 教师年龄
     */
    private Integer tAge;

    /**
     * 教授班级
     */
    private String tClazz;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}