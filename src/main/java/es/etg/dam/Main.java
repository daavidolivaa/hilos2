package es.etg.dam;

public class Main {
    public static void main(String[] args) {

        Thread madre1 = new Thread(new Madre("Margarita"));
        Thread madre2 = new Thread(new Madre("Elena"));
        Thread hijo = new Thread(new Hijo("Manuel"));
        Thread hija = new Thread(new HIja("Maria"));

        madre1.start();
        madre2.start();
        hijo.start();
        hija.start();
    }
}