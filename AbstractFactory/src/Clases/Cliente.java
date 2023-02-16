package Clases;

public class Cliente {
    private Caja caja;
    private Boton boton;
    public Cliente(Fabrica fabrica) {
        caja = fabrica.crearCaja();
        boton = fabrica.crearBoton();
    }
    public void mostrar() {
        boton.mostrar();
        caja.mostrar();

    }

}
