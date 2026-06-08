/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonia;
//Kelvin Garcia Vargas 20241606
public class Cliente {

    private String nombre;
    private String numeroTelefonico;
    private Plan plan;

    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public Plan getPlan() {
        return plan;
    }
}