/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;
//Kelvin Garcia Vargas 20241606
public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();

        Vehiculo v2 = new Vehiculo("A199821");

        Vehiculo v3 = new Vehiculo(
                "B788904",
                "Mazda",
                "Demio"
        );

        System.out.println("Costo 1: " +
                v3.calcularMantenimiento(10000));

        System.out.println("Costo 2: " +
                v3.calcularMantenimiento(
                        10000,
                        "Basico"));

        System.out.println("Costo 3: " +
                v3.calcularMantenimiento(
                        10000,
                        "Completo",
                        5));
    }
}