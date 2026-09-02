package modulo2.minhaPratica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

// ao implementar declaro <T> ao final de cada
public class RepositorioTeste<T> implements Repositorio<T> {

    // no construtor só passo os tipos
    private Map<String , T > forma;

    public RepositorioTeste(){
        this.forma = new HashMap<>();
    }

    @Override
    public void salvar(String id, T item){
        this.forma.put(id, item);
    }

    @Override
    public void remover(String id){
        this.forma.remove(id);
    }
    @Override
    public T buscar(String id){
        return this.forma.get(id);
    }
    //foi 
    @Override
    public List<T> listar(T item){
        return new ArrayList<>(forma.values());
    }
    @Override
    public int total(){
        return forma.size();
    }

}
