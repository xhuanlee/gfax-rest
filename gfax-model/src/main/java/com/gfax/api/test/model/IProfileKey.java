package com.gfax.api.test.model;

public class IProfileKey {
    private String umid;

    private String username;

    public String getUmid() {
        return umid;
    }

    public void setUmid(String umid) {
        this.umid = umid == null ? null : umid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}