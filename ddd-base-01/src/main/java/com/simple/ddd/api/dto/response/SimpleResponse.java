package com.simple.ddd.api.dto.response;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:29
 **/
public class SimpleResponse<T> extends AirResponse<T> {
    public SimpleResponse(T data) {
        this.setData(data);
        this.errorCode = 0;
        this.errorMessage = "成功";
    }


    public SimpleResponse() {
        this.errorCode = 0;
        this.errorMessage = "成功";
    }

    public SimpleResponse(Integer code, String msg) {
        this.errorCode = code;
        this.errorMessage = msg;
    }

    public static <T> SimpleResponse<T> error(Integer code, String msg) {
        SimpleResponse<T> response = new SimpleResponse<T>();
        response.returnCode(code);
        response.returnMsg(msg);
        response.setStatus(false);
        return response;
    }

    public SimpleResponse<T> returnCode(Integer returnCode) {
        this.errorCode = returnCode;
        return this;
    }

    public SimpleResponse<T> returnMsg(String returnMsg) {
        this.errorMessage = returnMsg;
        return this;
    }
}
