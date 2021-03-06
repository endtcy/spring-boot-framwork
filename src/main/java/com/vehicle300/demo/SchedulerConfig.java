package com.vehicle300.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

@Configuration
@EnableScheduling
public class SchedulerConfig implements SchedulingConfigurer {

    /**
     * 线程池配置
     *
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //只会有一个任务，无须手动创建线程池
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(2));
    }
}