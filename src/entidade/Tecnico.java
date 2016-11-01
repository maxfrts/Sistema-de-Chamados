package entidade;

import java.io.Serializable;

public class Tecnico extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    public Tecnico(String nome, long telefone) {
        super(nome, telefone);
    }

    @Override
    public String toString() {
        return this.getNome();
    }

}
