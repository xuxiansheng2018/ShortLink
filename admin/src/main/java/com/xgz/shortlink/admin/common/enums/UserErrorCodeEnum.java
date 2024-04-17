package com.xgz.shortlink.admin.common.enums;

import com.xgz.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * @Author xuguozhu
 * @Create 2024/4/8 14:31
 * Level:
 * Description:
 */
public enum UserErrorCodeEnum implements IErrorCode {

    //用户token验证失败
    USER_TOKEN_FAIL("A000200", "用户token验证失败"),

    // =====用户不存在=======
    USER_NULL("B000200", "用户记录不存在"),
    USER_USERNAME_EXIST("B000201", "用户名已存在"),
    USER_EXIST("B000202", "用户已存在"),
    USER_SAVE_ERROR("B000203", "用户新增失败"),
    ;

    private final String code;
    private final String message;
    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
    @Override
    public String code() {
        return code;
    }
    @Override
    public String message() {
        return message;
    }
}
