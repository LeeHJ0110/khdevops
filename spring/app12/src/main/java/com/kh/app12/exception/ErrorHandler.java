package com.kh.app12.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = Controller.class)
public class ErrorHandler {

//    @ExceptionHandler(ArithmeticException.class)
//    public String m01(){
//        System.out.println("AE");
//        return "errorPage";
//    }

    @ExceptionHandler(Exception.class)
    public String m02(){
        System.out.println("Exception");
        return "errorPage";
    }
}
