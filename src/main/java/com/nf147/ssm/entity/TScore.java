package com.nf147.ssm.entity;

public class TScore {

    private Integer id;

    private String name;

    private String curr;

    private Integer grade;

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
        this.name = name == null ? null : name.trim();
    }


    public String getCurr() {
        return curr;
    }


    public void setCurr(String curr) {
        this.curr = curr == null ? null : curr.trim();
    }


    public Integer getGrade() {
        return grade;
    }


    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}