package Clases;


import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        Caja caja = new CajaWindows();
        Boton boton = new BotonWindows();
        Cliente cliente = new Cliente(new FabricaWindows());
        cliente.mostrar();
    }
}