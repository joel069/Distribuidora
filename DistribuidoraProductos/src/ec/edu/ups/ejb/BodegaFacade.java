package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Bodega;

public class BodegaFacade extends AbstractFacade<Bodega> {

	
	 @PersistenceContext(unitName = "DistribuidoraProductos")
	    private EntityManager em;
	    
	    public BodegaFacade() {
		super(Bodega.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
}
