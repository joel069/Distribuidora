package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity
public class Producto implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String descripcion;
	private Float preciounitario;
	private Float preciopublico;
	@ManyToOne
	private Bodega bodega;
	
	public Producto() {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(Float preciounitario) {
		this.preciounitario = preciounitario;
	}

	public Float getPreciopublico() {
		return preciopublico;
	}

	public void setPreciopublico(Float preciopublico) {
		this.preciopublico = preciopublico;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodega == null) ? 0 : bodega.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((preciopublico == null) ? 0 : preciopublico.hashCode());
		result = prime * result + ((preciounitario == null) ? 0 : preciounitario.hashCode());
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
		Producto other = (Producto) obj;
		if (bodega == null) {
			if (other.bodega != null)
				return false;
		} else if (!bodega.equals(other.bodega))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (preciopublico == null) {
			if (other.preciopublico != null)
				return false;
		} else if (!preciopublico.equals(other.preciopublico))
			return false;
		if (preciounitario == null) {
			if (other.preciounitario != null)
				return false;
		} else if (!preciounitario.equals(other.preciounitario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", preciounitario="
				+ preciounitario + ", preciopublico=" + preciopublico + ", bodega=" + bodega + "]";
	}	
   
}
