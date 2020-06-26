package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Distribuidora
 *
 */
@Entity
public class Distribuidora implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	public String telefono;
	public String correo;
	@OneToMany(mappedBy = "distribuidora")
	public List<Bodega>bodega;
	
	
	
	public Distribuidora() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public List<Bodega> getBodega() {
		return bodega;
	}



	public void setBodega(List<Bodega> bodega) {
		this.bodega = bodega;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodega == null) ? 0 : bodega.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distribuidora other = (Distribuidora) obj;
		if (bodega == null) {
			if (other.bodega != null)
				return false;
		} else if (!bodega.equals(other.bodega))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Distribuidora [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo
				+ ", bodega=" + bodega + "]";
	}
	
}
