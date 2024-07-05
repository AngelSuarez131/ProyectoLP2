package Controlador;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Producto;
import Dao.ClassProductoImp;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Producto producto=new Producto();
		ClassProductoImp crud=new ClassProductoImp();
		
		
		//recuperamos la accion y codigo
		String accion=request.getParameter("accion");
		//aplicamos una condicion...
		if(accion!=null){
			switch(accion){
			case "Modificar":
				int codigo=Integer.parseInt(request.getParameter("cod"));
				//asignar el codigo...
				producto.setCod(codigo);
				Producto buscarcod=crud.BuscarProducto(producto);
				//enviar los valores buscados por codigo de la base de datos
				//al formulario actualizar..
				request.setAttribute("codigo",buscarcod.getCod());
				request.setAttribute("stock",buscarcod.getCant());
				request.setAttribute("nombre producto",buscarcod.getNomprod());
				request.setAttribute("descripcion",buscarcod.getDesprod());
	
				//redireccionar..
				request.getRequestDispatcher("/ActualizarProducto.jsp").forward(request, response);
				//salimos
				break;
			case "Eliminar":
				int codeliminar=Integer.parseInt(request.getParameter("cod"));
				//asignamos el codigo a eliminar
				producto.setCod(codeliminar);
				//invocamos al metodo eliminar...
				crud.EliminarProducto(producto);
				//refrescar el listado..
				List<Producto> listado=crud.ListadoProducto();
				request.setAttribute("listadodeproductos",listado);
				//redireccionar
				request.getRequestDispatcher("/ListadoProducto.jsp");
				//salimos
				break;
			
			case "Listar":
				List<Producto> listadoproducto=crud.ListadoProducto();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeproductos",listadoproducto);
				//redireccionamos
				request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
				//salimos
				break;
			case "Agregar":
                request.getRequestDispatcher("/AgregarProducto.jsp").forward(request, response);
                break;	
				
			 }  //fin del switch...
			
			
		}   //fin del if...
			
	} //fin del metodo doget..
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				
				//recuperamos los valores del formulario...
				String codigo=request.getParameter("codigo");
				String stock=request.getParameter("stock");
				String nombre=request.getParameter("nombre producto");
				String descrip=request.getParameter("descripcion");
			
				List<Producto> listadoproducto=null;
				
				//instanciar las respectivas entidades...
				Producto producto=new Producto();
				ClassProductoImp crud=new ClassProductoImp();
				//asignamos valores
				  producto.setCant(stock);
			        producto.setNomprod(nombre);
			        producto.setDesprod(descrip);
				if(codigo!=null){
					//recupero el codigo a  actualizar...
					int cod=Integer.parseInt(codigo);
					//asigno el codigo a actualizar
					producto.setCod(codigo);
					//invoco al metodo actualizar
					crud.ActualizarProducto(producto);
					//actualizador listado de clientes
					 listadoproducto=crud.ListadoProducto();
					
				}else{	
				//invocamos la metodo registrar...
				crud.RegistrarProducto(producto);
				
				
				//actualizador listado de clientes
				 listadoproducto=crud.ListadoProducto();
				
				} //fin del else...
				
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeproductos",listadoproducto);
				//redireccionamos
				request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
				
				
					
				
				
				
				
			}  //fin del metodo dopost...

		}