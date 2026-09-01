package modulo2;

import java.util.List;

public interface Repositorio<T> {

    void salvarItem(String id, T item);

    T buscarItem(String id);

    List<T> listarItens();

    void removerItem(String id);

    int totalItens();



}
