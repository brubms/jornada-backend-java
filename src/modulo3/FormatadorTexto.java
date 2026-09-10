package modulo3;

//Ela avisa o compilador: "Atenção! Esta interface só pode ter UM método abstrato!". Se alguém tentar colocar dois, o Java dá erro na hora.
@FunctionalInterface
public interface FormatadorTexto {

    String formatar(String texto);

}
