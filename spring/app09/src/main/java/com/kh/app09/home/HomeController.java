package com.kh.app09.home;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j // private final Logger log = LoggerFactory.getLogger(HomeController.class);
public class HomeController {


    @GetMapping("home")
    public void home(){

        log.trace("asddas");
        log.debug("asddas");
        log.info("asddas");
        log.warn("asddas");
        log.error("asddas");
    }
}
