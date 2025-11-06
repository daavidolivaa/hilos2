package es.etg.dam;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Personas implements Runnable {

    protected String nombre;

    @Override
    public void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    public void levantarse() {
        System.out.println("Se levanta " + nombre);
    }

}
