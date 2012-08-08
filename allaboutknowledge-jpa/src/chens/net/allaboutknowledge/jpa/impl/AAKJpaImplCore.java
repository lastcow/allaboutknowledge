/**
 * 
 */
package chens.net.allaboutknowledge.jpa.impl;

import javax.persistence.EntityManager;

/**
 * @author lastcow
 *
 */
public class AAKJpaImplCore{

	/***
	 * Generic method create model. -- C
	 * @param modelClass
	 * @throws Exception
	 */
	public static <T> void createModel(T model) throws Exception{
		// Check null
		if(model == null){
			throw new Exception("Nothing to create");
		}
		
		// Create
		EntityManager em = JpaResource.getEMF().createEntityManager();
		try{
			em.getTransaction().begin();
			em.persist(model);
			em.getTransaction().commit();
		}finally{
			em.close();
		}
	}
	
	/***
	 * Generic method get model by id. -- R
	 * @param modelClass
	 * @param id
	 * @return
	 */
	public static <T> Object getModelById(Class<T> modelClass, String id){
		return JpaResource.getEMF().createEntityManager().find(modelClass, id);
	}
	
	/***
	 * Generic method update model. -- U
	 * @param model
	 * @throws Exception
	 */
	public static <T> void updateModel(T model) throws Exception{
		// Check null
		if(model == null){
			throw new Exception("Nothing to delete");
		}
		
		// Create
		EntityManager em = JpaResource.getEMF().createEntityManager();
		try{
			em.getTransaction().begin();
			if(! em.contains(model)){
				// Make model managed.
				model = em.merge(model);
			}
			em.getTransaction().commit();
		}finally{
			em.close();
		}
	}
	
	/***
	 * Generic metohd delete model. -- D
	 * @param model
	 * @throws Exception
	 */
	public static <T> void deleteModel(T model) throws Exception{
		// Check null
		if(model == null){
			throw new Exception("Nothing to delete");
		}
		
		// Create
		EntityManager em = JpaResource.getEMF().createEntityManager();
		try{
			if(! em.contains(model)){
				// Make model managed.
				model = em.merge(model);
			}
			em.getTransaction().begin();
			em.remove(model);
			em.getTransaction().commit();
		}finally{
			em.close();
		}
	}
	
	
}
