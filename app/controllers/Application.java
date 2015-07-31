package controllers;
import java.util.List;
import models.Categoria;
import models.Estudiante;
import models.Unidad_Academica;
import play.mvc.Controller;

public class Application extends Controller {
	public static void index() {
		
		Categoria cat= Categoria.find("SELECT c FROM Categoria c ORDER BY id DESC LIMIT 1").first();
			if (cat == null) {
				cat= inicializar();
			} 	
				render();
		}
	
	private static Categoria inicializar() {
		Categoria cat;
			cat =new Categoria(1,"Programacion orietada");
			cat.save();
			cat =new Categoria(2,"Estructura");
			cat.save();
			return cat;
		}
	public static void indexforo() {

		List<Categoria> cate=Categoria.findAll();
		render(cate);
		
	}
	public static void contacto() {

		render();
	}
	
};