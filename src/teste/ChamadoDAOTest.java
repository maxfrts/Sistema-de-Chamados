/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Persistencia.ChamadoDAO;
import entidade.Chamado;
import entidade.RegistroChamado;
import java.util.Collection;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31553524
 */
public class ChamadoDAOTest {
    
    @Test
    public void TestChamadoDAO() {
        ChamadoDAO chDao = new ChamadoDAO();
        HashMap<Integer, Chamado> hashChamado = new HashMap<>();
        HashMap<Integer, Chamado> hashRegistroChamado = new HashMap<>();
        assertNotNull(chDao);
    }

    @Test
    public void testGetRegistrosNotNull() {
        ChamadoDAO chDao = new ChamadoDAO();
        Collection<RegistroChamado> registros = chDao.getRegistros();
        assertNotNull(registros);
    }
    
    @Test
    public void testGetChamados() {
        ChamadoDAO chDao = new ChamadoDAO();
        Collection<Chamado> chamados = chDao.getChamados();
        assertNotNull(chamados);
    }

}