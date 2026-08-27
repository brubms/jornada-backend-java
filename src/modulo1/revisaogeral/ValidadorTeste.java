package modulo1.revisaogeral;

public class ValidadorTeste {

    public boolean estarVazio(String texto){
        if(texto==null || texto.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}
