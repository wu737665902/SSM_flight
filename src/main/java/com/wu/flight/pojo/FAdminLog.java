package com.wu.flight.pojo;


/**
 * @ClassName: FAdminLog
 * @Description: 用户日志表
 * @Author: farfetched
 * @CreateDate: 2018/10/28 18:00
 * @Version: 1.0
 */
public class FAdminLog {

    private Integer id; // 
    private String username; //用户账号
    private String name; //名称
    private Integer roleId; //角色ID
    private String cotent; //日志信息
    private Integer type; //日志类型
    private String addTime; //添加时间

    public FAdminLog(Integer id, String username, String name, Integer roleId, String cotent, Integer type, String addTime) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.roleId = roleId;
        this.cotent = cotent;
        this.type = type;
        this.addTime = addTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "FAdminLog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", roleId=" + roleId +
                ", cotent='" + cotent + '\'' +
                ", type=" + type +
                ", addTime='" + addTime + '\'' +
                '}';
    }
}
