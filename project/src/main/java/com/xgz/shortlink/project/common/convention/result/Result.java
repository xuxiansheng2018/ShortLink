package com.xgz.shortlink.project.common.convention.result;

/**
 * @Author xuguozhu
 * @Create 2024/4/7 18:14
 * Level:
 * Description:
 */

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * 全局返回对象
 */
@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 5679018624309023727L;

    /**
     * 正确返回码
     */
    public static final String SUCCESS_CODE = "0";

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 请求ID
     */
    // TODO: 2024/4/7 在复杂系统中要和全链路ID挂定   单机系统 每次请求 使用拦截器 生成md5 
    private String requestId;

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }
}