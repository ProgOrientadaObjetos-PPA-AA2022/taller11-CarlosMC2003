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
public class MenuEco extends Menu{
    private double porcenDesc;
    
    public MenuEco (String nombre, double valorIni,
            double  porcen) {
        super(nombre, valorIni);
        porcenDesc = porcen;
    }
    
    public void establecerPorcentajeDescuento(double n) {
        porcenDesc = n / 100;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMen = valorIniMen - (valorIniMen * porcenDesc);
    }
    
    public double obtenerPorcentaje() {
        return porcenDesc;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Economico:\n"
               + "\tPlato: %s\n"
               + "\tValor Inicial: %.2f\n"
               + "\tPorcentaje Descuento: %.0f\n"
               + "\tValor Menu: %.2f\n", 
               obtenerNombre(),
               obtenerValorInicialMenu(),
               (obtenerPorcentaje() * 100),
               obtenerValorMenu());
        
        return cadena;
    }
}
