package com.dguan.mybatis_plus.exception;

import com.dguan.mybatis_plus.pojo.ReturnResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * springboot异常处理
 * @author Di Guan on 8/7/2021 4:02 PM
 */

@RestControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(DataNotFoundException.class)
    public ReturnResult dataNotFoundException(Exception e){
        e.printStackTrace();
        return new ReturnResult(404, "no data found", null);
    }

    @ExceptionHandler(Exception.class)
    public ReturnResult exceptionHandler(Exception e){
        e.printStackTrace();
        return new ReturnResult(404, "other types of exception", null);
    }
}
