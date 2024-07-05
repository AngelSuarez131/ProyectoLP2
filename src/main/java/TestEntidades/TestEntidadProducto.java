package TestEntidades;

import java.util.List;


import Dao.ClassProductoImp;
import model.Producto;

public class TestEntidadProducto {

	public static void main(String[] args) {
		//realizamos la respectiva instancia de las clases...
		Producto producto=new Producto();
		ClassProductoImp crud=new ClassProductoImp();
		//asignamos valores
	/*	producto.setCant("10");
		producto.setNomprod("TÉMPERA OVE MORADO");
		producto.setDesprod("Presentación: 250 ml");
	
		//invocamos al metodo registrar...
		crud.RegistrarProducto(producto);
		*/
		//testeamos el metodo listado
		List<Producto> listado=crud.ListadoProducto();
		for(Producto lis:listado){
			
			//imprimimos por pantalla
			System.out.println("stock "+lis.getCant()+
					" nombre producto "+lis.getNomprod()+" descripcion "+lis.getDesprod());
		}
		
		
		

	}   //fin del metodo main...

} //fin de la clase...
