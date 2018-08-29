package com.example.demo.controller;

import com.example.demo.base.BaseController;
import com.example.demo.base.Response;
import com.example.demo.service.StaffService;
import com.example.demo.vo.RoleVO;
import com.example.demo.vo.StaffVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:13.
 */
@RestController
@RequestMapping("/staff")
public class StaffController extends BaseController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/listAll")
    public Response listAll() throws Exception {
        List<StaffVO> staffs = staffService.listAll();
        return success(staffs);
    }

    @GetMapping("/getById")
    public Response getById(Long id) throws Exception {
        StaffVO staff = staffService.getById(id);
        return success(staff);
    }

    @PostMapping("/save")
    public Response save(@RequestBody StaffVO staff) throws Exception {
        staffService.save(staff);
        return success(staff.getId());
    }

    @PostMapping("/update")
    public Response update(@RequestBody StaffVO staff) throws Exception {
        staffService.update(staff);
        return success();
    }

    @GetMapping("/deleteById")
    public Response deleteById(Long id) throws Exception {
        staffService.deleteById(id);
        return success();
    }

    @GetMapping("/getRoleById")
    public Response getRoleById(Long id) throws Exception {
        List<RoleVO> roleVOList = staffService.getRoleById(id);
        return success(roleVOList);
    }
}
