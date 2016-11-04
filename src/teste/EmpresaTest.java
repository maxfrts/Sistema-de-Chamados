package teste;

import entidade.Empresa;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassiano
 */
public class EmpresaTest {
    
    @Test
    public void testGetNumeroContrato() {
        Empresa emp = new Empresa();
        
        emp.setNumeroContrato(3456);
        
        Assert.assertEquals(3457, emp.getNumeroContrato());
    }
    
    @Test
    public void testGetNomeEmpresa() {
        Empresa emp = new Empresa();
        emp.setNomeEmpresa("Adidas");
        
        Assert.assertEquals("Adidas", emp.getNomeEmpresa());
    }
}
