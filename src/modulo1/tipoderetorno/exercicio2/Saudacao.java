package modulo1.tipoderetorno.exercicio2;

public class Saudacao {

    public String  saudar(String nome, String periodo){
        if(periodo.equalsIgnoreCase("manha"))
            return "Bom dia, " + nome + "!";
            
        if(periodo.equalsIgnoreCase("tarde"))
            return "Boa tarde, " + nome + "!";
        
        if(periodo.equalsIgnoreCase("noite"))
            return "Boa noite, " + nome + "!";
        
        return "Perído inválido";
    }

}
