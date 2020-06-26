package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Producto;

public class ProductoFacade extends AbstractFacade<Producto>{

	 @PersistenceContext(unitName = "DistribuidoraProductos")
	    private EntityManager em;
	    
	    public ProductoFacade() {
		super(Producto.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
}
