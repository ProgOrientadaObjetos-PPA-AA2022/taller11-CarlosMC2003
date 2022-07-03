/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.util.ArrayList;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> menus;
    private double valorTotal;
    private double valorSubTotal;
    private double iva;
    
    public Cuenta(String nombre, ArrayList<Menu> mens){
        nombreCliente = nombre;
        menus = mens;
    }
    
    public Cuenta(String nombre, ArrayList<Menu> mens, double iv){
        nombreCliente = nombre;
        menus = mens;
        iva = iv;
    }
    
    public void establecerNombreCliente(String n){
        nombreCliente = n;
    }
    
    public void establecerListaMenus(ArrayList<Menu> n) {
        menus = n;
    }
    
    public void establecerIVA() {
        iva = 0.12;
    }
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public ArrayList<Menu> obtenerListadoMenus() {
        return menus;
    }
    
    public double obtenerIVA() {
        return iva;
    }
    
    public void calcularSubTotal() {
        double suma = 0;

        for (int i = 0; i < menus.size(); i++) {
            suma = suma + menus.get(i).obtenerValorMenu();
        }
        valorSubTotal = suma;
    }
    
    public void calcularTotal() {
        double suma = 0;

        for (int i = 0; i < menus.size(); i++) {
            suma = suma + menus.get(i).obtenerValorMenu();
        }
        valorTotal = suma + (suma * iva);
    }
    
    public double obtenerSubTotal() {
        return valorSubTotal;
    }
    
    public double obtenerTotal() {
        return valorTotal;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n", nombreCliente);
        
        for (int i = 0; i < menus.size(); i++) {
            cadena = String.format("%s%s\n", cadena, menus.get(i));
        }
        
        cadena = String.format("%s"
                + "Subtotal: %.1f\n"
                + "IVA: %.0f\n"
                + "Total a pagar: %.3f\n", cadena,
                valorSubTotal,
                (iva * 100),
                valorTotal);
        return cadena;
    }
 }
