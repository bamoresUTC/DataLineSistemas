package controllers;
import models.Categoria;
import models.Estudiante;
import models.Facultad;
import models.Foro;
import models.Unidad_Academica;
import play.mvc.Controller;

public class Application extends Controller {
	public static void index() {
		Foro  foros =  inicio();
		
		Unidad_Academica uni=inicializar();
		Facultad fac = iniciar2();
		Estudiante e=iniciar();
		Categoria ca= iniciar5();
		
		render(foros,uni,fac,ca,e);
		
		
	}

	public static void iniciarsesion() {
		Estudiante e=iniciar();
		Facultad fac = iniciar2();

		render(e,fac);
	}
	
	private static  Foro inicio() {
 Foro foro = new Foro(1, "Uso de Jq", "Es un lenguaje de programacion ", "12-02-2015", "4");
	foro.addComentario(2, "Buen Aporte", "12-04-2015", "Bueno");
		foro.save();
		return foro;
		
		
	}
	private static  Unidad_Academica inicializar() {
		Unidad_Academica uni = new Unidad_Academica(1, "Ciya", "0987655433");
uni.addFacultad(1, "Sistemas", "096464646644");
		uni.save();
		return uni;
		
		
	}
	private static  Facultad  iniciar2() {
		Facultad fac = new Facultad(2,"industrial","0976543553");
       fac.addestuantes(1, "jaun", "JUan90", "calle", "Manta", "0987654345", "jaun90@gmail.com", "1234");
       fac.addestuantes(2, "pedro", "calles", "_____", "pangua", "0343353544", "dfkgjfskg@gmail.com", "12345");
		fac.save();
		return fac;
		
		
	}
	
	private static  Estudiante  iniciar() {
		Estudiante e  = new Estudiante(2, "marco", "MARK", "Peralta", "lata", "09789800", "Mark09@gmail.com", "9089");
  e.addforos(2, "administracionoracle", "sentencias", "12-12-2012", "regular");
		e.save();
		return e;
		
		
	}
	
	private static  Categoria  iniciar5() {
		Categoria ca = new Categoria(1, "Base de datos");
				ca.addForos(1, "altas", "Insertar datos", "03-04-2015", "Alta");
		ca.save();
		return ca;
		
		
	}
	
	
	public static void registro() {
		render();
	}
};