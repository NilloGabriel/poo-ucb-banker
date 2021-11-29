/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;

/**
 *
 * @author Xatuba Pox
 */
public class ClienteDAO {
    private Cliente cle = new Cliente();
    private static EntityManager clienteManager; //hibernate
    
    public ClienteDAO() {
        clienteManager = ConnectionFactory.getEntityManager();    
    }
    
    public boolean login(String email, String senha) {
        boolean found;
        
        try {
            clienteManager = ConnectionFactory.getEntityManager();
            EntityManager em = clienteManager;  
            Query query;
            query = em.createQuery("SELECT c.emailLogin, c.senhaLogin FROM Cliente c WHERE c.emailLogin = :email AND c.senhaLogin = :senha");
            query.setParameter("emailLogin", email);
            query.setParameter("senhaLogin", senha);
            List lista = query.getResultList();
            
            if(!lista.isEmpty()) {
                found = true;
            } else {
                found = false;
            }
        } catch (Exception e) {
            found = false;
        }
        
        return found;
    }
}
