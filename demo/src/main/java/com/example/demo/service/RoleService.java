package com.example.demo.service;

import com.example.demo.vo.StaffVO;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:46.
 */
public interface RoleService {

    List<StaffVO> getStaffById(Long id) throws Exception;

}
