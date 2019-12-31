package com.nacl.myba.bean;

/**
 * @author nacl
 */
public class Admin {
    private Long id;
    private String name;
    private String pwd;
    private String note;
    private int state;

    public Admin(Long id, String name, String pwd, String note, int state) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.note = note;
        this.state = state;
    }

    public Admin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
