package Clases;

public class FabricaMac implements  Fabrica{
    public Caja crearCaja() {
        return new CajaMac();
    }
    public Boton crearBoton() {
        return new BotonMac();
    }

}
