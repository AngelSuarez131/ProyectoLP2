package Interfaces;

import java.util.List;


import model.Producto;
public interface IProducto {
	
	//declaramos los metodos
		public void RegistrarProducto(Producto producto);
		public void ActualizarProducto(Producto producto);
		public void EliminarProducto(Producto producto);
		public Producto BuscarProducto(Producto producto);
		public List<Producto> ListadoProducto();

	}   //fin de la interface...


