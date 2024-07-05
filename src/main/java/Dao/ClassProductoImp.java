package Dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.Producto;

public class ClassProductoImp  implements IProducto{

	@Override
	public void RegistrarProducto(Producto producto) {
		//establecer conexion con la unidad de persistencia...
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoLDP2");
			    //permite gestionar entidades
				EntityManager em=fabr.createEntityManager();
				//iniciar transaccion
				em.getTransaction().begin();
				//registramos
				em.persist(producto);
				//emitimos mensaje por consola
				System.out.println("producto registrado en la BD correctamente");
				//confirmamos
				em.getTransaction().commit();
				//cerramos la transaccion
				em.close();
			}  //fin del metodo registrar...
		
	

	@Override
	public void ActualizarProducto(Producto producto) {
		//establecemos conexion con la unidad de persistencia...
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoLDP2");
				//permite gestionar entidades
				EntityManager em=fabr.createEntityManager();
				//iniciar transaccion
				em.getTransaction().begin();
				//actualizamos
				em.merge(producto);
				//comfirmamos 
				em.getTransaction().commit();
				//cerramos
				em.close();
				
		
	}

	@Override
	public void EliminarProducto(Producto producto) {
		//establecemos la conexion con unidad de persistencia.
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoLDP2");
				//gestionar las entidades
				EntityManager em=fabr.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//recuperamos el codigo a eliminar
				Producto elim=em.merge(producto);
				//procedemos a eliminar el registro
				em.remove(elim);
				//emitimos mensaje por consola
				System.out.println("Producto eliminado de la base de datos");
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
		
	}

	@Override
	public Producto BuscarProducto(Producto producto) {
		//establecemos la conexion con la unidad de persistencia..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoLDP2");
				//gestionar las entidads
				EntityManager em=fabr.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//recuperamos el codigo a buscar
				Producto busproducto=em.find(Producto.class,producto.getCod());
				//confirmamos 
				em.getTransaction().commit();
				//cerramos
				em.close();
				return busproducto;
	}

	@Override
	public List<Producto> ListadoProducto() {
		//establecemos la conexion con la unidad de persistencia..
        EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoLDP2");
        //gestionamos las entidads
        EntityManager em=fabr.createEntityManager();
        //iniciamos la transaccion
        em.getTransaction().begin();
        //recuperamos los clientes  de la base de datos
        //***********utilizando jpql
        List<Producto> listadoproductos=em.createQuery("select c from productos c",Producto.class).getResultList();
        //confirmamos la transaccion
        em.getTransaction().commit();
        //cerramos
        em.close();
		return listadoproductos;
	}

}
