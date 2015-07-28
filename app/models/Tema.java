package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Tema extends Model {
    private int codigo_tem;
    private String puntuacion;
    private String nombre;
    private String descripcion;

    public void crear(){
    }

    public void visualizar(){
    }

}
