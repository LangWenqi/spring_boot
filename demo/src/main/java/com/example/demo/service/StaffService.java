package com.example.demo.service;

import com.example.demo.vo.RoleVO;
import com.example.demo.vo.StaffVO;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:15.
 */
public interface StaffService {

    List<StaffVO> listAll() throws Exception;

    StaffVO getById(Long id) throws Exception;

    void save(StaffVO staff) throws Exception;

    void update(StaffVO staff) throws Exception;

    void deleteById(Long id) throws Exception;

    List<RoleVO> getRoleById(Long id) throws Exception;
}
