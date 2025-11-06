package es.etg.dam;

public class HIja extends Personas {

    public HIja(String nombre) {
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
