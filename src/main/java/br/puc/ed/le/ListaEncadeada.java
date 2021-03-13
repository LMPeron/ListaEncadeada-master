package br.puc.ed.le;

public class ListaEncadeada {
    private Node inicio;
    private Node fim;

    public ListaEncadeada(){
        inicio = null;
    }

    public void inserirNoInicio(Aeroporto aeroporto) {
        Node novoNode = new Node(aeroporto);
        if (inicio == null) {
            this.fim = novoNode;
        }
        novoNode.setProximo(inicio);
        this.inicio = novoNode;
    }

    public void inserirNoFim(Aeroporto aeroporto) {
        Node novoNode = new Node(aeroporto);
        if (inicio == null) {
            this.inicio = novoNode;
        }
        fim.setProximo(novoNode);
        fim = novoNode;
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
