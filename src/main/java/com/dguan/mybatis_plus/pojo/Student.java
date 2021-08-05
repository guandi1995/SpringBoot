package com.dguan.mybatis_plus.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Di Guan on 8/5/2021 11:09 AM
 */
@Data
@TableName(value = "studentinfo")
public class Student {
    @TableId("stuid")
    private Integer id;
    @TableField("stuname")
    private String name;
    @TableField("age")
    private Integer age;
    @TableField("gender")
    private String gender;
    @TableField("major_id")
    private Integer major_id;
}
