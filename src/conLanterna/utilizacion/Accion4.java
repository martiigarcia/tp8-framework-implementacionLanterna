package conLanterna.utilizacion;

import garcia.framework.Accion;

public class Accion4 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("♠♠♠♠");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion N° 4";
    }

    @Override
    public String descripcionItemMenu() {
        return "Imprimir picas";
    }

    @Override
    public String toString() {
        return this.nombreItemMenu() + ": " + descripcionItemMenu();
    }
}
