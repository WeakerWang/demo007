package com.wxd.demo007.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxd.demo007.model.Worker;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wxd
 * @since 2021-04-30
 */
public interface IWorkerService extends IService<Worker> {
    List<Worker> findAllWorker();
}
