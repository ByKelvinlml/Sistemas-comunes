/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefonia;
//Kelvin Garcia Vargas 20241606
public class Plan {

    private int minutosIncluidos;
    private double datosGb;
    private double precioMensual;

    public Plan(int minutosIncluidos, double datosGb, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGb = datosGb;
        this.precioMensual = precioMensual;
    }

    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public double getDatosGb() {
        return datosGb;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }
}
