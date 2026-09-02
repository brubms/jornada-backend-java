package modulo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioMemoria<T> implements Repositorio<T> {


    private Map<String, T> dados;

    public RepositorioMemoria(){
        this.dados = new HashMap<>();
    }
    @Override
    public void salvarItem(String id, T item){
        dados.put(id, item);
    }
    @Override
    public T buscarItem(String id){
        if(!dados.containsKey(id)){
            throw new ItemNaoLocalizadoException(id + "Não localizado");
        }

       return dados.get(id);
    }
    @Override
    public List<T> listarItens(){
        return new ArrayList<>(this.dados.values());
    }
    @Override
    public void removerItem(String id){
        dados.remove(id);
    }
    @Override
    public int totalItens(){
        return dados.size();
    }


}
