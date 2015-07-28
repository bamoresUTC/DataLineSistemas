package models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity

public class Unidad_Academica extends Model {
    private int codigo;
    private String nombre;
    private String telefono;
  //para crear automaticacmente la bd
  	@OneToMany(cascade = CascadeType.ALL)
  	@MapKey(name = "codigo_fac")
  	//para relacionar
  	public Map<Long, Facultad> facultades;
    public Unidad_Academica(int codigo, String nombre, String telefono) {
    	this.facultades = new HashMap<Long, Facultad>();
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public void addFacultad(long codigo_fac, String nombre, String telefono)
	{
	Facultad facul = new Facultad(codigo_fac, nombre, telefono);
	this.facultades.put(codigo_fac, facul);	
	}

}
