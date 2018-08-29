package com.example.demo.service.impl;

import com.example.demo.dao.RoleMapper;
import com.example.demo.service.RoleService;
import com.example.demo.vo.StaffVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:46.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<StaffVO> getStaffById(Long id) throws Exception {
        return roleMapper.listRoleStaffById(id);
    }
}
