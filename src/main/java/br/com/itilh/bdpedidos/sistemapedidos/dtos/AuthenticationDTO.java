package br.com.itilh.bdpedidos.sistemapedidos.dtos;

public class AuthenticationDTO {
    
    private String login;
    private String password;

    public AuthenticationDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
