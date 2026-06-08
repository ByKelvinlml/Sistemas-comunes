/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;
//Kelvin Garcia Vargas 20241606
public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    //Constructor vacio
    public Vehiculo() {
        this.placa = "Sin placa";
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
    }

    //Constructor basico
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
    }

    //Constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Setter y Getter
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //sobrecarga 1
    public double calcularMantenimiento(int km) {
        return km * 0.10;
    }

    //sobrecarga 2
    public double calcularMantenimiento(int km, String tipoServicio) {

        if (tipoServicio.equalsIgnoreCase("Basico")) {
            return km * 0.10 + 500;
        }

        return km * 0.10 + 1000;
    }

    //sobrecarga 3
    public double calcularMantenimiento(int km, String tipoServicio, int antiguedad) {

        double costo;

        if (tipoServicio.equalsIgnoreCase("Basico")) {
            costo = km * 0.10 + 500;
        } else {
            costo = km * 0.10 + 1000;
        }

        costo += antiguedad * 100;

        return costo;
    }
}