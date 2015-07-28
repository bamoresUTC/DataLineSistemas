package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
@Entity

public class Estudiante extends Model { 
	public long code;
    public  String nombre;
    public String usuario;
    public String apellido;
    public String direccion;
    public String telefono;
    public String correoInstitucional;
    public String contrasena;
    
    
    
    //para crear automaticacmente la bd
   	@OneToMany(cascade = CascadeType.ALL)
   	@MapKey(name = "code")
   	//para relacionarION
   	public Map<Long, Foro> foros;
   	
	public Estudiante(long code, String nombre, String usuario,
			String apellido, String direccion, String telefono,
			String correoInstitucional, String contrasena) {
		this.foros = new HashMap<Long, Foro>();
		this.code = code;
		this.nombre = nombre;
		this.usuario = usuario;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoInstitucional = correoInstitucional;
		this.contrasena = contrasena;
	}
	public void addforos(long code, String tema, String descripcion, String fecha,String puntuacion) {
		Foro  f = new Foro(code,  tema, descripcion, fecha, puntuacion);
		this.foros.put(code, f);
	
}

}