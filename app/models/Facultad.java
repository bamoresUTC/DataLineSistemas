package models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity

public class Facultad extends Model{
     long codigo_fac;
    public String nombre;
    public String telefono;
	
    //para crear automaticacmente la bd
	@OneToMany(cascade = CascadeType.ALL)
	@MapKey(name = "code")
	//para relacionarION
	public Map<Long, Estudiante> estudiantes;

	public Facultad(long codigo_fac, String nombre, String telefono) {
		this.estudiantes = new HashMap<Long, Estudiante>();
		this.codigo_fac = codigo_fac;
		this.nombre = nombre;
		this.telefono = telefono;
		
	}

	public void addestuantes(long code, String nombre, String usuario,String apellido, String direccion, String telefono,String correoInstitucional, String contrasena) {
		Estudiante est = new Estudiante(code, nombre, usuario, apellido,  direccion,  telefono, correoInstitucional,  contrasena);
		this.estudiantes.put(code, est);	
	}


	

}
