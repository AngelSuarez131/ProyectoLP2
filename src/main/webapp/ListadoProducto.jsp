<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.*" %>
    <%@page import="model.Producto" %>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
 
  
    
<!DOCTYPE htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body bgcolor="#c5dec9">
<h1  align="center">Listado de Productos Registrados en BD</h1>

<h2 align="center">
<a href="AgregarProducto.jsp" style="text-decoration: none;color:blue;">Registar Producto</a>
</h2>
<table border="2" align="center">

<tr>
<td>Codigo</td>
<td>Stock</td>
<td>Nombre Producto</td>
<td>Descripcion</td>
<td colspan="2" align="center">Acciones</td>
</tr>

<%
List<Producto> listadoproducto=(List<Producto>)request.getAttribute("listadodeproductos");
//aplicamos una condicion..
if(listadoproducto!=null){
	//aplicamos un bucle for..
	for(Producto lis:listadoproducto){
		%>
		<tr><%=lis.getCod() %></td>
		<td><%=lis.getCant() %></td>
		<td><%=lis.getNomprod()%></td>
		<td><%=lis.getDesprod()%></td>
		<td><a href="ControladorProducto?accion=Eliminar&cod=<%=lis.getCod() %>">Eliminar</a></td>
	    <td><a href="ControladorProducto?accion=Modificar&cod=<%=lis.getCod() %>">Actualizar</a></td>
		
		</tr>
		
		
	<%	
	}   //fin del bucle for...
	%>
	<%
}  //fin de la condicion ...

%>
</table>
</body>
</html>