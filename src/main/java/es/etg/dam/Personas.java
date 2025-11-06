package es.etg.dam;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Personas implements Runnable {

    public static final String LEVANTA = "Se levanta";
    public static final String METODO_RUN = "Unimplemented method 'run'";

    protected String nombre;

    @Override
    public void run() {
        throw new UnsupportedOperationException(METODO_RUN);
    }

    public void levantarse() {
        System.out.println(LEVANTA + nombre);
    }

}
