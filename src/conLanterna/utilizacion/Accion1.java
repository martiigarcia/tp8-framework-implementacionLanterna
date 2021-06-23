package conLanterna.utilizacion;

import garcia.framework.Accion;

public class Accion1 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("♦♦♦♦");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion Nº 1";
    }

    @Override
    public String descripcionItemMenu() {
        return "Imprimir rombos";
    }

    @Override
    public String toString() {
        return this.nombreItemMenu() + ": " + descripcionItemMenu();
    }
}