/**
 * 
 */
package chens.net.allaboutknowledge.jpa.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import chens.net.allaboutknowledge.jpa.model.Gender;
import chens.net.allaboutknowledge.jpa.model.Member;

/**
 * @author lastcow
 *
 */
public class JpaResource {

	private static EntityManagerFactory emf;
	private static final String PersistenceUnit = "allaboutknowledge-jpa";
	
	/***
	 * Create EntityManagerFactory
	 * @return
	 */
	public static EntityManagerFactory getEMF(){
		if(emf == null){
			emf = Persistence.createEntityManagerFactory(PersistenceUnit);
		}
		
		return emf;
	}

}
