/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Carlos Morocho - PC
 */
public abstract class Menu {
    protected String nombre;
    protected double valorMen;
    protected double valorIniMen;
    
    public Menu(String nom, double valIni) {
        nombre = nom;
        valorIniMen = valIni;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerValorInicialMenu(double n) {
        valorIniMen = n;
    }
    
    public abstract void calcularValorMenu();
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public double obtenerValorInicialMenu() {
        return valorIniMen;
    }
    
    public double obtenerValorMenu() {
        return valorMen;
    }
}
