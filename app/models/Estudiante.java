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
	public String cedula;
	public  String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public String correoInstitucional;
    public String contrasena;
 
}