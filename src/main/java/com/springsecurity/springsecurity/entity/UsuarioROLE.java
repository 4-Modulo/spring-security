package com.springsecurity.springsecurity.entity;

public enum UsuarioROLE {
    ADMIN("admin"),
    USER("user");

    private String role;
    UsuarioROLE(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
}
