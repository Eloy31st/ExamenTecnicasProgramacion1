public class Cliente {
    private Caja caja;
    private Boton dialogo;
    public Cliente(Fabrica fabrica) {
        caja = fabrica.crearCaja();
        dialogo = fabrica.crearDialogo();
    }
    public void mostrar() {
        dialogo.mostrar();
        caja.mostrar();

    }
}
