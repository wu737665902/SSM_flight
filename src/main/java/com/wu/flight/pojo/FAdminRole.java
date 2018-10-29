package com.wu.flight.pojo;


public class FAdminRole {

    private Integer id; // 
    private String name; //名称
    private String menuId; //权限控制
    private String addTime; //添加时间

    public FAdminRole(Integer id, String name, String menuId, String addTime) {
        this.id = id;
        this.name = name;
        this.menuId = menuId;
        this.addTime = addTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }


    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "FAdminRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menuId='" + menuId + '\'' +
                ", addTime='" + addTime + '\'' +
                '}';
    }
}
