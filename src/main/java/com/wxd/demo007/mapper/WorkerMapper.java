package com.wxd.demo007.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxd.demo007.model.Worker;

import java.util.List;

/**
 * @author wangxudong
 * @title: WorkerMapper
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/2116:32
 */
public interface WorkerMapper extends BaseMapper<Worker> {
    List<Worker> findAllWorker();
}
