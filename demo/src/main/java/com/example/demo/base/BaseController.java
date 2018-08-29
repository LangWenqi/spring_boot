package com.example.demo.base;

/**
 * Created by flame on 2018/6/19下午2:28.
 * 基础controller
 */
public abstract class BaseController {

    /**
     * 成功返回带数据
     * @param data
     * @return
     */
    protected Response success(Object data) {
        Response response = new Response();
        response.setCode(200);
        response.setMsg("成功");
        response.setData(data);
        return response;
    }

    /**
     * 成功返回不带数据
     * @return
     */
    protected Response success() {
        Response response = new Response();
        response.setCode(200);
        response.setMsg("成功");
        return response;
    }

}
