/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonia;
//Kelvin Garcia Vargas 20241606
public class Main {

    public static void main(String[] args) {

        Plan plan1 = new Plan(300, 10, 1200);

        Cliente cliente1 = new Cliente(
                "Kelvin Garcia",
                "829-647-3288",
                plan1
        );

        Factura factura1 = new Factura(cliente1, 350, 12);

        factura1.generarFactura();
    }
}