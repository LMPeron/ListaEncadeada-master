package br.puc.ed.le;

public class Node {
    protected Aeroporto aeroporto;
    protected Node proximo;

    public Node(Aeroporto aeroporto){
        proximo = null;
        this.aeroporto = aeroporto;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }


    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }


    public Node getProximo() {
        return proximo;
    }


    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }


    @Override
    public String toString() {
        return "(" + this.aeroporto.getCodigoAeroporto() + ", " + this.aeroporto.getNomeCidade() + ") ";
    }
}
