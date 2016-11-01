package entidade;

import java.io.Serializable;

public class ClienteEmpresa extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private Empresa empresa;
    private long cpf;

    public ClienteEmpresa(Integer codigo, Empresa empresa, long cpf, String nome, long telefone) {
        super(nome, telefone);
        this.codigo = codigo;
        this.empresa = empresa;
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Contrato: " + empresa.getNumeroContrato()
                + " - Nome Empresa:" + empresa.getNomeEmpresa() + " - Cliente: "
                + getCpf() + " - " + getNome();
    }

}
