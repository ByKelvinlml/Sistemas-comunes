/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonia;
//Kelvin Garcia Vargas
public class Factura {

    private Cliente cliente;
    private double datosUsados;
    private int minutosUsados;

    public Factura(Cliente cliente, int minutosUsados, double datosUsados) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsados = datosUsados;
    }

    public double calcularMontoTotal() {
        double total = cliente.getPlan().getPrecioMensual();

        if (minutosUsados > cliente.getPlan().getMinutosIncluidos()) {
            int minutosExtra = minutosUsados - cliente.getPlan().getMinutosIncluidos();
            total += minutosExtra * 2;
        }

        if (datosUsados > cliente.getPlan().getDatosGb()) {
            double datosExtra = datosUsados - cliente.getPlan().getDatosGb();
            total += datosExtra * 50;
        }

        return total;
    }

    public void generarFactura() {
        System.out.println("======= FACTURA TELEFONICA =======");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Numero: " + cliente.getNumeroTelefonico());
        System.out.println("Precio mensual: RD$" + cliente.getPlan().getPrecioMensual());
        System.out.println("Datos usados: " + datosUsados + " GB");
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.println("Total a pagar: RD$" + calcularMontoTotal());
    }
}