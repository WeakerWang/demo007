package com.wxd.demo007.tools;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author wangxudong
 * @title: Cat
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/2115:55
 */
@Data
@Service
public class Cat {
    private String catName;
    public Cat setCatName(String name) {
        this.catName = name;
        return this;
    }
}