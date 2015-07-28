package models;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

import java.util.Set;
@Entity
public class Foro extends Model {
private long code;
public String tema;
public String descripcion;
public String fecha;
public String puntuacion;

//para crear automaticacmente la bd
	@OneToMany(cascade = CascadeType.ALL)
	@MapKey(name = "codigo")
	//para relacionarION
	public Map<Long, Comentario> comentarios;
	
	public Foro(long code, String tema, String descripcion, String fecha,
		String puntuacion) {
	this.comentarios = new HashMap<Long, Comentario>();
	this.code = code;
	this.tema = tema;
	this.descripcion = descripcion;
	this.fecha = fecha;
	this.puntuacion = puntuacion;
}
	
public void addComentario(long codigo, String descripcion, String fecha,
		String puntuacion) {
	Comentario comen = new Comentario(codigo,descripcion,fecha,puntuacion);
	this.comentarios.put(codigo, comen);	
}


	

}
