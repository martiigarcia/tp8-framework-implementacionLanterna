package conLanterna.utilizacion;

import garcia.framework.Accion;

public class Accion5 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("♣♣♣♣");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion N° 5";
    }

    @Override
    public String descripcionItemMenu() {
        return "Imprimir treboles";
    }

    @Override
    public String toString() {
        return this.nombreItemMenu() + ": " + descripcionItemMenu();
    }
}
