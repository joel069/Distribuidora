package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import ec.edu.ups.modelo.Distribuidora;

public class DistribuidoraFacade extends AbstractFacade<Distribuidora>{

	 @PersistenceContext(unitName = "DistribuidoraProductos")
	    private EntityManager em;
	    
	    public DistribuidoraFacade() {
		super(Distribuidora.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
}
