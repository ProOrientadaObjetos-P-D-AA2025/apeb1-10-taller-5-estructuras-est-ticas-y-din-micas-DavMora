package Ejercicio1;
import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> inventario;
    private ArrayList<Producto> carrito;
    private double total;

    public CarritoDeCompras() {
        inventario = new ArrayList<>();
        carrito = new ArrayList<>();
        total = 0;
    }

    public void cargarProductosIniciales() {
        inventario.add(new Producto("Laptop", 1200, 5));
        inventario.add(new Producto("Mouse", 25, 20));
        inventario.add(new Producto("Teclado", 45, 10));
    }


    public void mostrarInventario() {
        for (Producto p : inventario) {
            System.out.println(p.getNombre() + " - Precio: $" + p.getPrecio() + " - Stock: " + p.getCantidad());
        }
    }

    
    private Producto buscarEnInventario(String nombre) {
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    
   

    public void agregarProducto(String nombre, int cantidad) {
        Producto encontrado = buscarEnInventario(nombre);
        if (encontrado != null) {
            if (cantidad <= encontrado.getCantidad()) {
                carrito.add(new Producto(nombre, encontrado.getPrecio(), cantidad));
                total += encontrado.getPrecio() * cantidad;
                System.out.println("Producto agregado al carrito.");
            } else {
                System.out.println("Cantidad insuficiente.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

  
    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (Producto p : carrito) {
            System.out.println(p.getNombre() + " x" + p.getCantidad() + " = $" + (p.getPrecio() * p.getCantidad()));
        }
        System.out.println("Total actual: $" + total);
    }


    public double calcularTotal() {
        return total;
    }


    public void realizarPago(double monto, double descuento) {
        double totalConDescuento = total;

        if (total > 1000) {
            totalConDescuento = total - (total * descuento / 100);
            System.out.println("Descuento aplicado del " + descuento + "%");
        }

        if (monto >= totalConDescuento) {
            System.out.println("Pago exitoso. ¡Gracias por su compra!");
           
            for (Producto comprado : carrito) {
                Producto original = buscarEnInventario(comprado.getNombre());
                if (original != null) {
                    original.setCantidad(original.getCantidad() - comprado.getCantidad());
                }
            }
        } else {
            double falta = totalConDescuento - monto;
            System.out.println("Pago insuficiente. Faltan $" + falta);
        }
    }
}
