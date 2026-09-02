package modulo2;

import java.util.List;
//<T> a partir de agora o T representa o tipo que meu cliente escolheu 
public interface Repositorio<T> {

    void salvarItem(String id, T item);

    T buscarItem(String id);

    List<T> listarItens();

    void removerItem(String id);

    int totalItens();



}
