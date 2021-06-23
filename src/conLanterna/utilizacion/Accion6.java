package conLanterna.utilizacion;

import garcia.framework.Accion;

public class Accion6 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("...");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 6";
    }

    @Override
    public String descripcionItemMenu() {
        return"puntitos";
    }
    @Override
    public String toString(){
        return nombreItemMenu()+ ": "+descripcionItemMenu();
    }
}
