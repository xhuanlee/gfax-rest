package com.gfax.api.test.model;

public class IProfile extends IProfileKey {
    private String db;

    private String passwd;

    private String desPasswd;

    private Integer login;

    private Integer status;

    private Integer iswhitelistip;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getDesPasswd() {
        return desPasswd;
    }

    public void setDesPasswd(String desPasswd) {
        this.desPasswd = desPasswd == null ? null : desPasswd.trim();
    }

    public Integer getLogin() {
        return login;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIswhitelistip() {
        return iswhitelistip;
    }

    public void setIswhitelistip(Integer iswhitelistip) {
        this.iswhitelistip = iswhitelistip;
    }
}