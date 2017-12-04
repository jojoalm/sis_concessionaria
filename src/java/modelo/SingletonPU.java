/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;


/**
 *
 * @author JOSI
 */
public class SingletonPU {
    
   private static EntityManagerFactory factory = null;

    public static EntityManager getManager() {
       
            if (factory == null){
                factory = Persistence.createEntityManagerFactory("PU");
            }
            return factory.createEntityManager();
        

    }
    
}
