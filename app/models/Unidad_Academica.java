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
  

}
