/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Cliente;

/**
 *
 * @author Xatuba Pox
 */
public class ClienteDAO {
    private static EntityManager clienteManager;
    
    public boolean login(String email, String senha) {
        boolean found = false;
        
        try {
            clienteManager = ConnectionFactory.getEntityManager();
            EntityTransaction transaction = clienteManager.getTransaction();
            
            transaction.begin();
            String q = "FROM Cliente c WHERE c.emailLogin = '"+ email +"'";
            List<Cliente> clientes = clienteManager.createQuery(q).getResultList(); 
            
            for(Cliente tempCli : clientes) {
                if(tempCli.getSenhaLogin().equals(senha)) {
                    found = true;
                    break;
                }
            }
            transaction.commit();
        } finally {
            clienteManager.close();
        }
        
        return found;
    }
}
