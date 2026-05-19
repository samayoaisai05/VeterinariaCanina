package com.mycompany.peluqueriacanina.logica;

public class Duenio {
    
    private Integer id;
    private String nombre;
    private String cel;

    public Duenio() {
    }

    public Duenio(Integer id, String nombre, String cel) {
        this.id = id;
        this.nombre = nombre;
        this.cel = cel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
    
}
