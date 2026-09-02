package modulo2.minhaPratica;
import java.util.List;
public interface Repositorio<T> {

    //método para salvar
    void salvar(String id, T item);
    //remover 
    void remover(String id);
    //buscar 
    T buscar(String id);
    //listar 
    List<T> listar(T item);
    // total dentro
    int total();



}
