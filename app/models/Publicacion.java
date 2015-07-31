package models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Publicacion extends Model {
public long code;
public String tema;
public String descripcion;
public String fecha;
public int puntuacion;
public Publicacion(long code, String tema, String descripcion, String fecha,
		int puntuacion) {
	super();
	this.code = code;
	this.tema = tema;
	this.descripcion = descripcion;
	this.fecha = fecha;
	this.puntuacion = puntuacion;
}	

}
