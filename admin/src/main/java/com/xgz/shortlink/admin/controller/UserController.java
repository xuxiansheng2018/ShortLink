package com.xgz.shortlink.admin.controller;

import com.xgz.shortlink.admin.common.convention.result.Result;
import com.xgz.shortlink.admin.common.convention.result.Results;
import com.xgz.shortlink.admin.dto.resp.UserRespDTO;
import com.xgz.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xuguozhu
 * @Create 2024/4/7 15:48
 * Level:
 * Description:
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUserName(username));
        //之前的代码版本
//        UserRespDTO result = userService.getUserByUserName(username);
//        if (result == null) {
//            return new Result<UserRespDTO>().setCode(UserErrorCodeEnum.USER_NULL.code()).setMessage(UserErrorCodeEnum.USER_NULL.message());
//        } else {
////            return new Result<UserRespDTO>().setCode("0").setData(result);  Result-->Results
//            return Results.success(result);
//        }
    }

    /**
     * 查询用户名是否存在
     */
    @GetMapping("/api/shortlink/v1/user/has-username")
    public Result<Boolean> hasUserName(@RequestParam("username") String username) {
        Boolean b = userService.hasUsername(username);
        return Results.success(b);
    }
}

