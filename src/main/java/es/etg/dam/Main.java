package es.etg.dam;

public class Main {

    public static final String MADRE1 = "Margarita";
    public static final String MADRE2 = "Elena";
    public static final String HIJO = "Manuel";
    public static final String HIJA = "Maria";

    public static final String DESPERTADOR = "Suena el despertador";

    public static void main(String[] args) {

        Thread madre1 = new Thread(new Madre(MADRE1));
        Thread madre2 = new Thread(new Madre(MADRE2));
        Thread hijo = new Thread(new Hijo(HIJO));
        Thread hija = new Thread(new HIja(HIJA));

        System.out.println(DESPERTADOR);

        madre1.run();
        madre2.run();
        hijo.run();
        hija.run();
    }
}
