package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nomus;

	private String contraus;

	public Usuario() {
	}

	public String getNomus() {
		return this.nomus;
	}

	public void setNomus(String nomus) {
		this.nomus = nomus;
	}

	public String getContraus() {
		return this.contraus;
	}

	public void setContraus(String contraus) {
		this.contraus = contraus;
	}

}