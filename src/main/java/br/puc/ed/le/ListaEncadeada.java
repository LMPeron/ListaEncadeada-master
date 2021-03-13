package br.puc.ed.le;

public class ListaEncadeada {
    private Node inicio;
    private Node fim;

    public ListaEncadeada(){
        inicio = null;
    }

    public void inserirNoInicio(String codigoAeroporto, String nomeCidade){

    }

    public void inserirNoFim(String codigoAeroporto, String nomeCidade){

    }

    public Node excluirNoInicio(){
        //asd
        return null;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void imprimirTodos(){
        Node noAtual = inicio;
        while (noAtual != null){
            System.out.print(noAtual + ") -> ");
            noAtual = noAtual.proximo;
        }
        System.out.print("\n\n");
    }
}
