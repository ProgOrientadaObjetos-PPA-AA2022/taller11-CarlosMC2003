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
public class MenuCarta extends Menu {
   private double valorPorciGuar;
   private double valorBebida;
   private double porcentaje;
   
   public MenuCarta(String nombre, double valorIni,
           double porci, double bebi, double porce) {
       super(nombre, valorIni);
       valorPorciGuar = porci;
       valorBebida = bebi;
       porcentaje = porce;
   }
   
   public void establecerValorPorciones(double n) {
       valorPorciGuar = n;
   }
   
   public void establecerValorBebida(double n) {
       valorBebida = n;
   }
   
   public void establecerPorcentajeAdicional(double n) {
       porcentaje = n / 100;
   }
   
   @Override
   public void calcularValorMenu(){
       valorMen = valorIniMen + valorPorciGuar + valorBebida + (porcentaje * valorIniMen);
   }
   
   public double obtenerValorPorciones() {
       return valorPorciGuar;
   }
   
   public double obtenerValorBebida() {
       return valorBebida;
   }
   
   public double obtenerPorcentajeAdicional() {
       return porcentaje;
   }
   
   @Override
   public String toString() {
       String cadena = String.format("Menu a la Carta:\n"
               + "\tPlato: %s\n"
               + "\tValor Inicial: %.2f\n"
               + "\tValor Guarnición: %.2f\n"
               + "\tValor Bebida: %.2f\n"
               + "\tPorcentaje Adicional: %.0f\n"
               + "\tValor Menu: %.2f\n", 
               obtenerNombre(),
               obtenerValorInicialMenu(),
               obtenerValorPorciones(),
               obtenerValorBebida(),
               (obtenerPorcentajeAdicional() * 100),
               obtenerValorMenu());
       
       return cadena;
   }
}
