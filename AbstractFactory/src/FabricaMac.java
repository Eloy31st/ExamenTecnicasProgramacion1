public class FabricaMac implements  Fabrica{
    public Caja crearCaja() {
        return new CajaMac();
    }
    public Boton crearDialogo() {
        return new BotonMac();
    }
}
