package es.dam.pspr;

public class Servidor {

    public static void main(String[] args) {
        new Servidor();
    }

    public Servidor(){
        menu();
    }

    private void menu(){
        System.out.println("******** MENU ********");

        System.out.println("1) Leer el ultimo mensaje");
        System.out.println("2) Escribir un nuevo mensaje");
        System.out.println("3) Borrar un numero de mensajes");
        System.out.println("4) Leer los ultimos 5 mensajes");
        System.out.println("5) Borrar un mensaje especifico");
        System.out.println("6) Salir");
    }


}
