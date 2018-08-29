package com.example.demo.dao;

import com.example.demo.vo.StaffVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:17.
 */
public interface RoleMapper {

    List<StaffVO> listRoleStaffById(@Param("roleId") Long roleId) throws Exception;
}
