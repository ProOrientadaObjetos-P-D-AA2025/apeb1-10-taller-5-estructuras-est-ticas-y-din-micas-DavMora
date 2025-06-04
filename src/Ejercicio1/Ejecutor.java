
package Ejercicio1;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.cargarProductosIniciales();

        int opcion;
        double descuentoPromo = 10; 

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver detalle de compra");
            System.out.println("4. Calcular total");
            System.out.println("5. Realizar pago");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1:
                    carrito.mostrarInventario();
                    break;
                case 2:
                    System.out.print("Nombre del producto: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = teclado.nextInt();
                    teclado.nextLine();
                    carrito.agregarProducto(nombre, cantidad);
                    break;
                case 3:
                    carrito.mostrarDetalleCompra();
                    break;
                case 4:
                    System.out.println("Total: $" + carrito.calcularTotal());
                    break;
                case 5:
                    System.out.print("Ingrese monto pagado: $");
                    double monto = teclado.nextDouble();
                    carrito.realizarPago(monto, descuentoPromo);
                    break;
                case 0:
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }

        } while (opcion != 0);
    }
}
