package com.boot.producer.model;

import com.boot.common.base.BaseModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author gy
 * @since 2018-08-30
 */

public class UserModel extends BaseModel {

    private static final long serialVersionUID = 1L;


    private String id;
    /**
     * 账号
     */

    private String username;
    /**
     * 密码
     */

    private String password;
    /**
     * 昵称
     */

    private String nickname;
    /**
     * 身份
     */

    private String roles;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", nickname=" + nickname +
        ", roles=" + roles +
        "}";
    }
}
