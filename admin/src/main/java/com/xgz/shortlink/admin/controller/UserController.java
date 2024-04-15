package com.xgz.shortlink.admin.controller;

import com.xgz.shortlink.admin.common.convention.result.Result;
import com.xgz.shortlink.admin.common.convention.result.Results;
import com.xgz.shortlink.admin.dto.req.UserLoginReqDTO;
import com.xgz.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xgz.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.xgz.shortlink.admin.dto.resp.UserLoginRespDTO;
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
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.updateUser(requestParam);
        return Results.success();
    }


    /**
     * 用户登录
     * 使用redis存储登录token
     * 为了解决用户重复登录的情况,使用hash结构
     */
    @PostMapping("/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        UserLoginRespDTO result = userService.login(requestParam);
        return Results.success(result);
    }

    /**
     * 根据token判断用户是否登录
     */
    @GetMapping("/check-login")
    public Result<Boolean> checkLogin(@RequestParam("token") String token) {
        return Results.success(userService.checkLogin(token));
    }

    /**
     * 判断用户是否登录v2.0
     *
     */
    // TODO: 2024/4/11 代码逻辑有问题
    @GetMapping("/check-login2")
    public Result<Boolean> checkLogin2(@RequestParam("username") String username,@RequestParam("token") String token) {
        Boolean aBoolean = userService.checkLogin2(username, token);
        System.out.println("aBoolean = " + aBoolean);
        return Results.success(userService.checkLogin2(username,token));
    }

    /**
     * 用户退出
     */
    @DeleteMapping("/logout")
    public Result<Void>  logout(@RequestParam("username") String username,@RequestParam("token") String token){
        userService.logout(username,token);
        return Results.success();
    }

}

