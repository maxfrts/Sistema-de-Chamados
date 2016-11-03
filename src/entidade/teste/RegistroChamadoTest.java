package entidade.teste;

import entidade.RegistroChamado;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassiano
 */
public class RegistroChamadoTest {
    
    @Test
    public void testGetCodigo() {
        RegistroChamado rcCodigo = new RegistroChamado();
        rcCodigo.setCodigo(1);
        
//        Assert.assertEquals(3, rcCodigo.getCodigo());
    }
    
    @Test
    public void testGetHora() {
        RegistroChamado rcHora = new RegistroChamado();
        rcHora.setHora("16:10");
        
        Assert.assertEquals("17h", rcHora.getHora());
    }
    
    @Test
    public void testGetData() {
        RegistroChamado rcData = new RegistroChamado();
        rcData.setData("02/11/2016");
        
        Assert.assertEquals("02/11/2016", rcData.getData());
    }
    
    @Test
    public void testGetAssunto() {
        RegistroChamado rcAssunto = new RegistroChamado();
        rcAssunto.setAssunto("Peculiar");
        
        Assert.assertEquals("Peculiar", rcAssunto.getAssunto());
    }
    
    
}
