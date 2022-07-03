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
public class MenuNinios extends Menu{
    private double valorPorciHe;
    private double valorPorciPa;
    
    public MenuNinios(String nombre, double valorIni,
           double porciHe, double porciPa) {
       super(nombre, valorIni);
       valorPorciHe = porciHe;
       valorPorciPa = porciPa;
   }
    
    public void establecerValorPorciHelado(double n) {
        valorPorciHe = n;
    }
    
    public void establecerValorPorciPastel(double n) {
        valorPorciPa = n;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMen = valorIniMen  + valorPorciHe + valorPorciPa;
    }
    
    public double obtenerValorPorciHelado() {
        return valorPorciHe;
    }
    
    public double obtenerValorPorciPastel() {
        return valorPorciPa;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Niños:\n"
               + "\tPlato: %s\n"
               + "\tValor Inicial: %.2f\n"
               + "\tValor Helado: %.2f\n"
               + "\tValor Pastel: %.2f\n"
               + "\tValor Menu: %.2f\n", 
               obtenerNombre(),
               obtenerValorInicialMenu(),
               obtenerValorPorciHelado(),
               obtenerValorPorciPastel(),
               obtenerValorMenu());
        
        return cadena;
    }
}
