/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import paquete02.*;
/**
 *
 * @author Carlos Morocho - PC
 */
public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;
    
    public MenuDia (String nombre, double valorIni,
            double postre, double bebida){
        super(nombre, valorIni);
        valorPostre = postre;
        valorBebida = bebida;
    }
    
    public void establecerValorPostre(double n) {
        valorPostre = n;
    }
    
    public void establecerValorBebida(double n) {
        valorBebida = n;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMen = valorIniMen + valorPostre + valorBebida;
    }
    
    public double obtenerValorPostre() {
        return valorPostre;
    }
    
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Dia\n"
               + "\tPlato: %s\n"
               + "\tValor Inicial: %.2f\n"
               + "\tValor Postre: %.2f\n"
               + "\tValor Bebida: %.2f\n"
               + "\tValor Menu: %.2f\n", 
               obtenerNombre(),
               obtenerValorInicialMenu(),
               obtenerValorPostre(),
               obtenerValorBebida(),
               obtenerValorMenu());
        
        return cadena;
    }
}
