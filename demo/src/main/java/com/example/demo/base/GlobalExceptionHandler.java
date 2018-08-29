package com.example.demo.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by flame on 2018/6/19下午4:29.
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response ExceptionHandler(Exception e) throws Exception {
        LOGGER.error("系统内部错误, 错误信息:", e);
        Response response = new Response();
        response.setCode(500);
        response.setMsg("服务器开小差");
        return response;
    }
}
