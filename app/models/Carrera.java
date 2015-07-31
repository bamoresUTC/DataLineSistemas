package models;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
@Entity
public class Carrera extends Model{
     long codigo_fac;
    public String nombre;
    public String telefono;

}
