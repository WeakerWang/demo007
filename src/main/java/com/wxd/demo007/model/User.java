package com.wxd.demo007.model;

import com.xpc.easyes.core.anno.TableField;
import com.xpc.easyes.core.anno.TableId;
import com.xpc.easyes.core.anno.TableName;
import lombok.Data;

/**
 * @author wangxudong
 * @title: User
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/2116:59
 */
@Data
@TableName("user")
public class User {
    /**
     * id
     */
    @TableId
    private Integer id;
    /**
     * 名字
     */
    @TableField
    private String name;
    /**
     * 年龄
     */
    @TableField
    private Integer age;
    /**
     * 家庭地址
     */
    @TableField
    private String address;
    /**
     * 学校
     */
    @TableField
    private String school;
    /**
     * 手机号码
     */
    @TableField
    private String phone;
    /**
     * 身高
     */
    @TableField
    private String height;
    /**
     * 体重
     */
    @TableField
    private String weight;
    /**
     * 父亲
     */
    @TableField
    private String father;
    /**
     * 母亲
     */
    @TableField
    private String mather;
}
