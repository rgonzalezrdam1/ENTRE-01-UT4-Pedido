/**
 *  Clase para probar el resto de clases
 *  @Rubén González Rivera
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2;

    /**
     * Constructor  
     */
    public TestPedido(){
        // crear pedido1
        pedido1 = new Pedido(new Fecha(4,9,2019),
                             new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra"),
                             new LineaPedido(new Producto("Rotulador fosforecente", 6.70), 20),
                             new LineaPedido(new Producto("Memoria USB 64GB", 14.80), 10));
        // crear pedido2
        pedido2 = new Pedido(new Fecha(8,10,2019),
                             new Cliente("Elisa Nuin", "C/ Rio Alzaina 7", "Pamplona", "Navarra"),
                             new LineaPedido(new Producto("Sacapuntas manual", 16.64), 8),
                             new LineaPedido(new Producto("Corrector tippex", 5.99), 20));
    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos(){
        System.out.println(" Pedido 1" +
                            "\n------------------" +
                            "\n" + pedido1.toString() +
                            "\n Pedido 2" +
                            "\n------------------" +
                            "\n" + pedido2.toString());
        if(pedido1.masAntiguoQue(pedido2)){
            System.out.print("El pedido 1 se ha realizado antes que el pedido 2");
        }else{
            System.out.print("El pedido 2 se ha realizado antes que el pedido 1");
        }
    }
}
