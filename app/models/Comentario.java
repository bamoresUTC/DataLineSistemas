package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Comentario extends Model {
    public long code;
	public String descripcion;
	public String fecha;	

}
