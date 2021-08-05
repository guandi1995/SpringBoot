package com.dguan.mybatis_plus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 使用MyBatis-plus配置pojo类
 * @TableName： 声明Student类名 对应 数据库表名
 * @TableId： 声明实体类的主键属性名 对应 表中的主键名
 * @TableField： 声明实体类中的其他属性名 对应 表中的column名
 * @author Di Guan on 8/5/2021 11:09 AM
 */
@Data
@TableName(value = "studentinfo")
public class Student {
    //新增数据自增主键 type=IdType.AUTO
    @TableId(value = "stuid", type = IdType.AUTO)
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
