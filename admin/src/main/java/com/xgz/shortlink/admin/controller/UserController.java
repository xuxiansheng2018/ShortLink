package com.xgz.shortlink.admin.controller;

import com.xgz.shortlink.admin.common.convention.result.Result;
import com.xgz.shortlink.admin.common.convention.result.Results;
import com.xgz.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xgz.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.xgz.shortlink.admin.dto.resp.UserRespDTO;
import com.xgz.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xuguozhu
 * @Create 2024/4/7 15:48
 * Level:
 * Description:
 */
@RestController
@RequiredArgsConstructor

@RequestMapping("/api/short-link/v1/user")
public class UserController {
    private final UserService userService;

     /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/{username}")
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
    @GetMapping("/has-username")
    public Result<Boolean> hasUserName(@RequestParam("username") String username) {
        Boolean b = userService.hasUsername(username);
        return Results.success(b);
    }


    /**
     * 注册用户
     */
    @PostMapping
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }


    /**
     * 根据用户名  修改用户
     */
    @PutMapping
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam){
        userService.updateUser(requestParam);
        return Results.success();
    }



}

