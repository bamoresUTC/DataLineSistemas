package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Comentario extends Model {
    private long codigo;
	private String descripcion;
	private String fecha;
	private String puntuacion;
	
	
	public Comentario(long codigo, String descripcion, String fecha,
			String puntuacion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.puntuacion = puntuacion;
	}
	
	
	
}
