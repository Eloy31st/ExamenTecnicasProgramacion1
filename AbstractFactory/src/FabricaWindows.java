public class FabricaWindows implements Fabrica{
    public Caja crearCaja() {
        return new CajaWindows();
    }
    public Boton crearDialogo() {
        return new BotonWindows();
    }

}
