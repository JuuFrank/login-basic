package com.login.basic.dto;

public class ClientDTO {

    private Integer id;
    private String name;
    private String correo;


    public void setUsername(String username) {
        this.name = username;
    }

    public ClientDTO(Integer id, String name, String correo) {
        this.id = id;
        this.name = name;
        this.correo = correo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
