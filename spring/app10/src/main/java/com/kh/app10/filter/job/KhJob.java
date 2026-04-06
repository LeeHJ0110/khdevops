package com.kh.app10.filter.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KhJob {

    //cron : 초 분 시 일 월 요일
    @Scheduled(cron = "*/10 * * * * *")
    public void khJob(){
        log.info("hello");
    }
}
