package com.dguan.mybatis_plus.pojo;

import lombok.Data;

/**
 * @author Di Guan on 8/7/2021 4:08 PM
 */
@Data
public class ReturnResult {
    private Integer code;
    private String message;
    private Object data;

    public ReturnResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ReturnResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
