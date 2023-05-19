package com.wxd.demo007.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxd.demo007.mapper.WorkerMapper;
import com.wxd.demo007.model.Worker;
import com.wxd.demo007.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wxd
 * @since 2021-04-30
 */
@Service
public class WorkerServiceImpl extends ServiceImpl<WorkerMapper, Worker> implements IWorkerService {

    @Autowired
    private WorkerMapper workerMapper;
    @Override
    public List<Worker> findAllWorker() {


        List<Worker> employees = workerMapper.selectPage(new Page<Worker>(1,3),
                new QueryWrapper<Worker>()
                        .between("id",1,1)
                        .eq("name",1111)
        ).getRecords();
        System.out.println(employees);
        return workerMapper.findAllWorker();
    }
}
