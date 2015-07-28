package models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity

public class Categoria extends Model {
    private int codigo_cat;
    private String nombre;
    
  
  //para crear automaticacmente la bd
  	@OneToMany(cascade = CascadeType.ALL)
  	@MapKey(name = "code")
  	//para relacionarION
  	public Map<Long, Foro> foros;
  	
	public Categoria(int codigo_cat, String nombre) {		
		this.foros = new HashMap<Long,Foro>();
		this.codigo_cat = codigo_cat;
		this.nombre = nombre;
	}

    
	public void addForos(long code, String tema, String descripcion, String fecha,
			String puntuacion) {
		Foro foro = new Foro(code, tema,descripcion, fecha ,puntuacion);
		this.foros.put(code, foro);	
	}
    
}
