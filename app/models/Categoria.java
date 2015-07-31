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
    public long code;
    public String nombre;
    public Categoria(long code, String nombre) {
    	super();
		this.code = code;
		this.nombre = nombre;
	}

 
}
