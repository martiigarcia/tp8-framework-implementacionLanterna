package conLanterna.utilizacion;

import garcia.framework.Accion;

public class Accion3 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("♥♥♥♥");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion N° 3";
    }

    @Override
    public String descripcionItemMenu() {
        return "Imprimir corazones";
    }

    @Override
    public String toString() {
        return this.nombreItemMenu() + ": " + descripcionItemMenu();
    }
}
