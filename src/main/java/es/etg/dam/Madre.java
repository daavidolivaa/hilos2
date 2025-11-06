package es.etg.dam;

public class Madre extends Personas {

    public Madre(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        int aleatoria = (int) ((Math.random() * 8) + 3);
        try {
            Thread.sleep(aleatoria);
        } catch (InterruptedException e) {
        }
        levantarse();
    }

}
