package com.xgz.shortlink.project.common.convention.errorcode;

/**
 * @Author xuguozhu
 * @Create 2024/4/8 14:12
 * Level:
 * Description:
 */

/**
 * 平台错误码
 */
public interface IErrorCode {
    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}