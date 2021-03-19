package br.puc.ed.le;

public class ListaEncadeada {
    private Node inicio;
    private Node fim;
    private int qtdElementos;

    public ListaEncadeada(){
        inicio = null;
        qtdElementos = 0;
    }

    public void inserirNoInicio(Aeroporto aeroporto) {
        Node novoNode = new Node(aeroporto);
        if (isVazia()) {
            this.fim = novoNode;
        }
        novoNode.setProximo(inicio);
        this.inicio = novoNode;
        qtdElementos++;
    }

    public void inserirNoFim(Aeroporto aeroporto) {
        Node novoNode = new Node(aeroporto);
        if (isVazia()) {
            this.inicio = novoNode;
        }
        fim.setProximo(novoNode);
        fim = novoNode;
        qtdElementos++;
    }

    public Node excluirNoInicio(){
        inicio = inicio.getProximo();
        qtdElementos--;
        return null;
    }

    public void inserirNoProximo(String node, Aeroporto aeroporto) {
        Node n = inicio;
        Node novo = new Node(aeroporto);
        while(!(n.getAeroporto().getCodigoAeroporto().equals(node)) && !(n.equals(fim))) {
            n = n.getProximo();
        }
        novo.setProximo(n.getProximo());
        n.setProximo(novo);
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

    public Node getFim() {
        return fim;
    }

    public Node getPenultimo() {
        Node anterior = inicio;
        Node ultimo = inicio.getProximo();
        while (!ultimo.equals(fim)) {
            anterior = ultimo;
            ultimo = ultimo.getProximo();
        }
        return anterior;
    }

    public void imprimirPenultimo() {
        System.out.print(getPenultimo());
    }

    public void imprimirUltimo() {
        System.out.print(getFim());
    }

    public int getQtdElementos() {
        return qtdElementos;
    }

    public void setQtdElementos(int qtdElementos) {
        this.qtdElementos = qtdElementos;
    }
}
