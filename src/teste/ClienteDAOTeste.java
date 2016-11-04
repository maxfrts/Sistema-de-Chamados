/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import java.util.HashMap;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author 31553524
 */
public class ClienteDAOTeste {
    
    @Test
    public void TestClienteDAO() {
        ClienteDAO clDao = new ClienteDAO();
        HashMap<Long, ClienteEmpresa> hashCliente = new HashMap<>();
        assertNotNull(clDao);
    }
    
    @Test
    public void testValidarCPF(Long cpf) {
        HashMap<Long, ClienteEmpresa> hashCliente = new HashMap<>();
        
        ClienteEmpresa ce = hashCliente.get(cpf);
        
        assertNotNull(ce);
    }
    
}
