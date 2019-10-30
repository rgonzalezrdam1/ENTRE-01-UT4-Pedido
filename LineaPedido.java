
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   @Rubén González Rivera
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;
     

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto, int cantidad){
         this.producto = new Producto(producto.getNombre(), producto.getPrecio());
         this.cantidad = cantidad;
    }

     /**
     * accesor para el producto
     */
    public Producto getProducto(){
         return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad(){
        return cantidad;
    }
    
    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public LineaPedido obtenerCopia(){
         return new LineaPedido(new Producto(producto.getNombre(), producto.getPrecio()), cantidad);
    }
    
     /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString(){
        String str = "";
        str = String.format("%30s | %8.2f€ | %4d unidades", producto.getNombre(), producto.getPrecio(), cantidad);
       return str;
    }
}
