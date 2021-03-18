package br.puc.ed.le;

public class MainApp {

    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.inserirNoInicio(new Aeroporto("LDB", "Londrina"));
        listaEncadeada.inserirNoFim(new Aeroporto("VCP", "Campinas"));
        listaEncadeada.inserirNoFim(new Aeroporto("BPS", "Porto Seguro"));
        listaEncadeada.imprimirTodos();
        listaEncadeada.inserirNoInicio(new Aeroporto("MGF", "Maringá"));
        listaEncadeada.imprimirTodos();
        Aeroporto salvador = new Aeroporto("SSA", "Salvador");
        listaEncadeada.inserirNoInicio(salvador);
        listaEncadeada.imprimirTodos();
        listaEncadeada.inserirNoProximo(salvador, new Aeroporto("LEK", "Leonardo"));
        listaEncadeada.imprimirTodos();
    }
}
