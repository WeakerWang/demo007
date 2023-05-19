package com.wxd.demo007.controller;

import com.wxd.demo007.mapper.UserMapper;
import com.wxd.demo007.model.User;
import com.xpc.easyes.core.conditions.LambdaEsIndexWrapper;
import com.xpc.easyes.core.conditions.LambdaEsQueryWrapper;
import com.xpc.easyes.core.enums.Analyzer;
import com.xpc.easyes.core.enums.FieldType;
import lombok.RequiredArgsConstructor;
import org.omg.CORBA.ObjectHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxudong
 * @title: TestUseEeController
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/2116:46
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestUseEeController {
    private UserMapper userMapper;
    @GetMapping("/createIndex")
    public Object createIndex(){

        LambdaEsIndexWrapper<User> wrapper = new LambdaEsIndexWrapper<>();
        // 此处简单起见 索引名称须保持和实体类名称一致,字母小写 后面章节会教大家更如何灵活配置和使用索引
        wrapper.indexName(User.class.getSimpleName().toLowerCase());

        // 此处将文章标题映射为keyword类型(不支持分词),文档内容映射为text类型,可缺省
        // 支持分词查询,内容分词器可指定,查询分词器也可指定,,均可缺省或只指定其中之一,不指定则为ES默认分词器(standard)
        wrapper.mapping(User::getAddress, FieldType.KEYWORD, Analyzer.IK_MAX_WORD);
        // 设置分片及副本信息,3个shards,2个replicas,可缺省
        wrapper.settings(3,2);

        // 设置别名信息,可缺省
        String aliasName = "daily";
        wrapper.createAlias(aliasName);

        // 创建索引
        return userMapper.createIndex(wrapper);
    }

    @GetMapping("/add")
    public Object add(User user){
        return userMapper.insert(user);
    }

    @GetMapping("/list")
    public Object userList(User user){
        LambdaEsQueryWrapper<User> wrapper = new LambdaEsQueryWrapper<>();
        //排序 年龄降序
        wrapper.orderByAsc(User::getAge);
        //查询 姓名
        wrapper.like(User::getName, user.getName());

/*        //分词 查询
        wrapper.match(ObjectHelper.notEmpty(user.getAddress()), User::getAddress, user.getAddress());
//过滤  只现实某些字段
        wrapper.select(User::getName);
//过滤 不显示姓名字段
        wrapper.notSelect(User::getName);
//排序 年龄降序
        wrapper.orderByAsc(User::getAge);*/

        //返回值
        return userMapper.selectList(wrapper);
    }

    @GetMapping("/edit")
    public Object edit(User user){
        return userMapper.updateById(user);
    }
}
