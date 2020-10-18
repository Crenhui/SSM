package com.duyi.onlinevideo.entity;

import java.util.Date;

/**
 * user
 * 
 * @author bianj
 * @version 1.0.0 2020-08-20
 */
public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7214657716726960336L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer id;

    /** mobile */
    private String mobile;

    /** username */
    private String username;

    /** password */
    private String password;

    /** email */
    private String email;

    /** vipFlag */
    private String vipFlag;

    /** createTime */
    private Date createTime;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     *
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取mobile
     *
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * 设置mobile
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取username
     *
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置username
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取password
     *
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取email
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取vipFlag
     *
     * @return vipFlag
     */
    public String getVipFlag() {
        return this.vipFlag;
    }

    /**
     * 设置vipFlag
     *
     * @param vipFlag
     */
    public void setVipFlag(String vipFlag) {
        this.vipFlag = vipFlag;
    }

    /**
     * 获取createTime
     *
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}