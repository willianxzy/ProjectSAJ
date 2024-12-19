package br.com.itilh.bdpedidos.sistemapedidos.model;

public enum UsersRole {

    ADMIN("admin"),
    USER("user");


    private String role;

    UsersRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
