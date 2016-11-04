package teste;

import org.junit.Test;
import static org.junit.Assert.*;
import entidade.*;
import junit.framework.Assert;

/**
 *
 * @author Cassiano
 */
public class ChamadoTest {

    @Test
    public void testGetCodigo() {
        Chamado c = new Chamado();

        c.setCodigo(12);

        Assert.assertEquals(13, c.getCodigo());
    }

    @Test
    public void testGetStatus() {
        Chamado c = new Chamado();

        c.setStatus("Ativo");

        Assert.assertEquals("Ativo", c.getStatus());
    }

    @Test
    public void testGetTipoProblema() {
        Chamado c = new Chamado();

        c.setTipoProblema("");

        Assert.assertEquals("A", c.getTipoProblema());
    }

    @Test
    public void testGetHora() {
        Chamado c = new Chamado();

        c.setHora("19h");

        org.junit.Assert.assertEquals("19h", c.getHora());
    }

    @Test
    public void testGetData() {
        Chamado c = new Chamado();

        c.setData("02/11/2016");

        org.junit.Assert.assertEquals("02/11/2016", c.getData());
    }

    @Test
    public void testGetTitulo() {
        Chamado c = new Chamado();

        c.setTitulo("ABC");

        Assert.assertEquals("ABC", c.getTitulo());
    }

    @Test
    public void testGetDescricao() {
        Chamado c = new Chamado();

        c.setDescricao("NIKE");

        Assert.assertEquals("NIKE", c.getDescricao());
    }

    @Test
    public void testGetPioridade() {
        Chamado c = new Chamado();

        c.setPrioridade(2);

        Assert.assertEquals(3, c.getPrioridade());
    }

    @Test
    public void testGetSistemaOperacional() {
        Chamado c = new Chamado();

        c.setSistemaOperacional("Linux");

        Assert.assertEquals("Linux", c.getSistemaOperacional());
    }

    @Test
    public void testGetVersaoSO() {
        Chamado c = new Chamado();

        c.setVersaoSO("1.0");

        Assert.assertEquals("1.2", c.getVersaoSO());
    }

    @Test
    public void testGetBancoDeDados() {
        Chamado c = new Chamado();

        c.setBancoDeDados("Oracle");

        Assert.assertEquals("Oracle", c.getBancoDeDados());
    }

    @Test
    public void testGetCausaProblema() {
        Chamado c = new Chamado();

        c.setCausaProblema("N");

        Assert.assertEquals("", c.getCausaProblema());
    }

    @Test
    public void testGetSolucaoProblema() {
        Chamado c = new Chamado();

        c.setSolucaoProblema("");

        Assert.assertEquals("", c.getSolucaoProblema());
    }

    @Test
    public void testGetEnderecoRede() {
        Chamado c = new Chamado();
        c.setEnderecoRede("http://localhost:8080");

        Assert.assertEquals("http://localhost:8080", c.getEnderecoRede());
    }

    @Test
    public void testGetTipoConexao() {
        Chamado c = new Chamado();

        c.setTipoConexao("");

        Assert.assertEquals("Gv", c.getTipoConexao());
    }

    @Test

    public void testGetOperacao() {
        Chamado c = new Chamado();

        c.setOperacao("-");

        Assert.assertEquals("-", c.getOperacao());
    }

    @Test
    public void testGetDuracaoOperacao() {
        Chamado c = new Chamado();

        c.setDuracaoOperacao(2);

        Assert.assertEquals(2, c.getDuracaoOperacao());
    }

}