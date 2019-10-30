
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * @Rubén González Rivera
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente,LineaPedido linea1, LineaPedido linea2){
        this.fecha = fecha; 
        this.cliente = cliente; 
        this.linea1 = linea1; 
        this.linea2 = linea2; 
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha(){
        return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente(){
        return cliente;
    }

    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva(){
        double sinIva = 0;
        sinIva = linea1.getCantidad() * linea1.getProducto().getPrecio();
        sinIva += linea2.getCantidad() * linea2.getProducto().getPrecio();
        return sinIva;
    }

    /**
    * calcular y devolver el iva a aplicar
    */
    public double getIva(){
        double conIva = 0;
        conIva = getImporteAntesIva() * IVA;
        return conIva;
    }

    /**
    * calcular y devolver el importe total del pedido con Iva
    */
    public double getImporteTotal(){
        double total = 0;
        total = getIva() + getImporteAntesIva();
        return total;
    }

    /**
    * Representación textual del pedido
    * (ver enunciado)
    */
    public String toString(){
        String str = "";
        str = String.format("FECHA PEDIDO: %s \n", fecha.toString());
        str += String.format("DATOS DEL CLIENTE \n %s", cliente.toString());
        str += String.format("\n **** Articulos en el pedido **** \n\n %s", linea1.toString());
        str += String.format("\n %s", linea2.toString());
        str += String.format("\n\n **** A pagar **** \n\n");
        str += String.format("%20s %-8.2f\n", "IMPORTE SIN IVA:", getImporteAntesIva());
        str += String.format("%20s %-8.2f\n", "IVA:", getIva());
        str += String.format("%20s %-8.2f\n", "IMPORTE TOTAL:", getImporteTotal());
        return str;
    }

    /**
    * devuelve true si el pedido actual es más antiguo que el recibido 
    * como parámetro
    */
    public boolean masAntiguoQue(Pedido otro){
        return fecha.antesQue(otro.getFecha());
    }

    /**
    * devuelve una referencia al pedido actual
    */
    public Pedido getPedidoActual(){
        return this;
    }

}
