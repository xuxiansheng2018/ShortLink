package com.xgz.shortlink.admin.controller;

import com.xgz.shortlink.admin.common.convention.result.Result;
import com.xgz.shortlink.admin.common.convention.result.Results;

import com.xgz.shortlink.admin.dto.req.GroupSaveReqDTO;
import com.xgz.shortlink.admin.dto.resp.GroupRespDTO;
import com.xgz.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 16:52
 * Level:
 * Description:
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/short-link/v1/group")
public class GroupController {


    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping
    public Result<Void> saveGroup(@RequestBody GroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }

    /**
     * 查询用户短链接分组集合
     */
    @GetMapping
    public Result<List<GroupRespDTO>> listGroup() {
        List<GroupRespDTO> result=groupService.listGroup();
        return Results.success(result);
    }

}
