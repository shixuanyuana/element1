package com.itheima.pojo;

public class User {
    private  Integer id ;
    private  String schoolname ;

/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
*/

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
