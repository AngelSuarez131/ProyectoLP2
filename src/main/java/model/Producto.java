package model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String cod;

	private int cant;

	private String desprod;

	private String nomprod;

	public Producto() {
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getCant() {
		return this.cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getDesprod() {
		return this.desprod;
	}

	public void setDesprod(String desprod) {
		this.desprod = desprod;
	}

	public String getNomprod() {
		return this.nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

}