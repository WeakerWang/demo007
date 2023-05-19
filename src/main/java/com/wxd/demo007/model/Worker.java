package com.wxd.demo007.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author wangxudong
 * @title: Worker
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/2116:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Worker extends Model {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Long orgId;


}
