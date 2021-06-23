package conLanterna.utilizacion;

import garcia.framework.Accion;

public class Accion2 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("☻☻☻☻");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion Nº 2";
    }

    @Override
    public String descripcionItemMenu() {
        return "Imprimir caritas felices";
    }

    @Override
    public String toString() {
        return this.nombreItemMenu() + ": " + descripcionItemMenu();
    }

}