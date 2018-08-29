package com.example.demo.controller;

import com.example.demo.base.BaseController;
import com.example.demo.base.Response;
import com.example.demo.service.RoleService;
import com.example.demo.vo.StaffVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:39.
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/getStaffById")
    public Response getStaffById(Long id) throws Exception {
        List<StaffVO> staffs = roleService.getStaffById(id);
        return success(staffs);
    }
}
