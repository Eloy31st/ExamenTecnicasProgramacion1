package Clases;

public class FabricaWindows implements Fabrica{
    public Caja crearCaja() {
        return new CajaWindows();
    }
    public Boton crearBoton() {
        return new BotonWindows();
    }

}
