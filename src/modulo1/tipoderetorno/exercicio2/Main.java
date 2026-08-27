package modulo1.tipoderetorno.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Classificador classi = new Classificador();

        System.out.println("Digite o valor:");
        double valor = scan.nextDouble();

        Saudacao saudar = new Saudacao();
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Qual periodo: ");
        String periodo = scan.nextLine();
        String saudacao = saudar.saudar(nome, periodo);

        System.out.println(saudacao);

        
        
    }

}
