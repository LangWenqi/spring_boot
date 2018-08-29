package com.example.demo.service.impl;

import com.example.demo.dao.StaffMapper;
import com.example.demo.service.StaffService;
import com.example.demo.vo.RoleVO;
import com.example.demo.vo.StaffVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:16.
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<StaffVO> listAll() throws Exception {
        return staffMapper.listAll();
    }

    @Override
    public StaffVO getById(Long id) throws Exception {
        return staffMapper.getById(id);
    }

    @Override
    public void save(StaffVO staff) throws Exception {
        staffMapper.save(staff);
    }

    @Override
    public void update(StaffVO staff) throws Exception {
        staffMapper.update(staff);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        staffMapper.deleteById(id);
    }

    @Override
    public List<RoleVO> getRoleById(Long id) throws Exception {
        return staffMapper.listStaffRoleById(id);
    }
}
