package com.example.demo.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:23.
 */
public class RoleVO {

    /** 主键 */
    private Long id;

    /** 角色 */
    private String role;

    /** 描述 */
    private String description;

    /** 删除标记(1:未删除,0:已删除) */
    private Integer deleteFlag;

    /** 创建时间 */
    private Date createTime;

    /** 员工 */
    private List<StaffVO> staffs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<StaffVO> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<StaffVO> staffs) {
        this.staffs = staffs;
    }
}
