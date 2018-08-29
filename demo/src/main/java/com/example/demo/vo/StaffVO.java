package com.example.demo.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by flame on 2018/8/29下午1:21.
 */
public class StaffVO {

    /** 主键 */
    private Long id;

    /** 工号 */
    private String uid;

    /** 姓名 */
    private String name;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 删除标记(1:未删除,0:已删除) */
    private Integer deleteFlag;

    /** 创建时间 */
    private Date createTime;

    /** 角色 */
    private List<RoleVO> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public List<RoleVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleVO> roles) {
        this.roles = roles;
    }
}
