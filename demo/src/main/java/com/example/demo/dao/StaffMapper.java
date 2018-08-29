package com.example.demo.dao;

import com.example.demo.vo.RoleVO;
import com.example.demo.vo.StaffVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:16.
 */
public interface StaffMapper {

    List<StaffVO> listAll() throws Exception;

    StaffVO getById(@Param("id") Long id) throws Exception;

    void save(StaffVO staff) throws Exception;

    void update(StaffVO staff) throws Exception;

    void deleteById(@Param("id") Long id) throws Exception;

    List<RoleVO> listStaffRoleById(@Param("staffId") Long staffId) throws Exception;
}
