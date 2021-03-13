package br.puc.ed.le;

public class Aeroporto {
    protected String codigoAeroporto;
    protected String nomeCidade;
    protected Node proximo;

    public Aeroporto(String codigoAeroporto, String nomeCidade){
        proximo = null;
        this.codigoAeroporto = codigoAeroporto;
        this.nomeCidade = nomeCidade;
    }

    public String getCodigoAeroporto() {
        return codigoAeroporto;
    }

    public void setCodigoAeroporto(String codigoAeroporto) {
        this.codigoAeroporto = codigoAeroporto;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "(" + codigoAeroporto + ", " + nomeCidade + ") ";
    }
}
