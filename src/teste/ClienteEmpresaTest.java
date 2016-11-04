package teste;

import entidade.ClienteEmpresa;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassiano
 */
public class ClienteEmpresaTest {

    public ClienteEmpresaTest() {
    }

//    @Test
//    public void testGetCodigo() {
//        ClienteEmpresa ce = new ClienteEmpresa();
//
//        ce.setCodigo(432);
//
//        Assert.assertEquals(432, ce.getCodigo());
//    }

    @Test
    public void testGetCpf() {
        ClienteEmpresa ce = new ClienteEmpresa();

        ce.setCpf(567865654);

        Assert.assertEquals(999999999, ce.getCpf());
    }

}