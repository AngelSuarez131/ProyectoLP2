<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Registrar Producto</h1>
<form action="ControladorProducto" method="post">
<table border="2" align="center">
<tr>
<td>Codigo</td>
<td><input type="text" name="codigo"></td>
</tr>
<tr>
<td>Stock</td>
<td><input type="text" name="sotck"></td>
</tr>
<tr>
<td>Nombre Producto</td>
<td><input type="text" name="nombre producto"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion"></td>
</tr>


<tr>
<td colspan="2"  align="center" >
<input type="submit" value="Registrar Producto">
</td>
</tr>
</table>
</form>
</body>
</html>
