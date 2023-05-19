package com.wxd.demo007.controller;



import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.wxd.demo007.model.Worker;
import com.wxd.demo007.service.IWorkerService;
import com.wxd.demo007.tools.LoopTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wxd
 * @since 2021-04-30
 */
@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private IWorkerService iWorkerService;
    @GetMapping("getAll")
    public List<Worker> findAllWorker() throws InterruptedException {
        LoopTask loopTask = new LoopTask();
        loopTask.initLoopTask();
        Thread.sleep(5000L);
        loopTask.shutdownLoopTask();
        return iWorkerService.findAllWorker();
    }
}
