package br.puc.ed.le;

public class MainApp {

    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.inserirNoInicio("LDB", "Londrina");
        listaEncadeada.inserirNoFim("VCP", "Campinas");
        listaEncadeada.inserirNoFim("BPS", "Porto Seguro");
        listaEncadeada.imprimirTodos();
        listaEncadeada.inserirNoInicio("MGF", "Maringá");
        listaEncadeada.imprimirTodos();
        listaEncadeada.inserirNoFim("SSA", "Salvador");
        listaEncadeada.imprimirTodos();
    }
}
