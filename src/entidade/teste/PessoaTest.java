package entidade.teste;

import entidade.Pessoa;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassiano
 */
public class PessoaTest {
    
    @Test
    public void testGetNome() {
        Pessoa p = new Pessoa();
        p.setNome("Giulia");
        
        Assert.assertEquals("Giulia", p.getNome());
    }
    
    @Test
    public void testGetTelefone() {
        Pessoa p = new Pessoa();
        p.setTelefone(999098745);
        
        Assert.assertEquals(999999999, p.getTelefone());
    }
    
}
