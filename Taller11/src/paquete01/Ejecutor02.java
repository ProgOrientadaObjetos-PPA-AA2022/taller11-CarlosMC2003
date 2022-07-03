/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.*;
import paquete03.*;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
        };
        
        String[][] datos002 = {{"Econo 001", "4", "0.25"}, 
            {"Econo 002", "4", "0.15"},
            {"Econo 003", "4", "0.35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "0.10"}, 
            {"Carta 002", "7", "1.7", "2.1", "0.05"}, 
            {"Carta 003", "8", "1.9", "2.2", "0.05"}, 
            {"Carta 004", "9", "2.5", "2.9", "0.05"}, 
        };
                
        // Lista de Menus
        ArrayList <Menu> menus = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        MenuNinios menuNi = new MenuNinios(datos001[0][0], Double.parseDouble(datos001[0][1]), 
                Double.parseDouble(datos001[0][2]), Double.parseDouble(datos001[0][2]));
        menus.add(menuNi);
        
        MenuNinios menuNi2 = new MenuNinios(datos001[1][0], Double.parseDouble(datos001[1][1]), 
                Double.parseDouble(datos001[1][2]), Double.parseDouble(datos001[1][3]));
        menus.add(menuNi2);
        
        MenuNinios menuNi3 = new MenuNinios(datos001[2][0], Double.parseDouble(datos001[2][1]), 
                Double.parseDouble(datos001[2][2]), Double.parseDouble(datos001[2][3]));
        menus.add(menuNi3);
        
        MenuEco menuEc = new MenuEco(datos002[0][0], Double.parseDouble(datos002[0][1]), 
                Double.parseDouble(datos002[0][2]));
        menuEc.establecerPorcentajeDescuento(25);
        menus.add(menuEc);
        
        MenuEco menuEc2 = new MenuEco(datos002[1][0], Double.parseDouble(datos002[1][1]), 
                Double.parseDouble(datos002[1][2]));
        menuEc2.establecerPorcentajeDescuento(15);
        menus.add(menuEc2);
        
        MenuEco menuEc3 = new MenuEco(datos002[2][0], Double.parseDouble(datos002[2][1]), 
                Double.parseDouble(datos002[2][2]));
        menuEc3.establecerPorcentajeDescuento(35);
        menus.add(menuEc3);
        
        MenuDia menuD = new MenuDia(datos003[0][0], Double.parseDouble(datos003[0][1]), 
                Double.parseDouble(datos003[0][2]), Double.parseDouble(datos003[0][2]));
        menus.add(menuD);
        
        MenuDia menuD2 = new MenuDia(datos003[1][0], Double.parseDouble(datos003[1][1]), 
                Double.parseDouble(datos003[1][2]), Double.parseDouble(datos003[1][2]));
        menus.add(menuD2);
        
        MenuDia menuD3 = new MenuDia(datos003[2][0], Double.parseDouble(datos003[2][1]), 
                Double.parseDouble(datos003[2][2]), Double.parseDouble(datos003[2][2]));
        menus.add(menuD3);
        
        MenuCarta menuCar = new MenuCarta(datos004[0][0], Double.parseDouble(datos004[0][1]), 
                Double.parseDouble(datos004[0][2]), Double.parseDouble(datos004[0][3]), Double.parseDouble(datos004[0][4]));
        menuCar.establecerPorcentajeAdicional(10);
        menus.add(menuCar);
        
        MenuCarta menuCar2 = new MenuCarta(datos004[1][0], Double.parseDouble(datos004[1][1]), 
                Double.parseDouble(datos004[1][2]), Double.parseDouble(datos004[1][3]), Double.parseDouble(datos004[1][4]));
        menuCar2.establecerPorcentajeAdicional(5);
        menus.add(menuCar2);
        
        MenuCarta menuCar3 = new MenuCarta(datos004[2][0], Double.parseDouble(datos004[2][1]), 
                Double.parseDouble(datos004[2][2]), Double.parseDouble(datos004[2][3]), Double.parseDouble(datos004[2][4]));
        menuCar3.establecerPorcentajeAdicional(5);
        menus.add(menuCar3);
        
        MenuCarta menuCar4 = new MenuCarta(datos004[3][0], Double.parseDouble(datos004[3][1]), 
                Double.parseDouble(datos004[3][2]), Double.parseDouble(datos004[3][3]), Double.parseDouble(datos004[3][4]));
        menuCar4.establecerPorcentajeAdicional(5);
        menus.add(menuCar4);
        // Fin de solución
        
        for (int i = 0; i < menus.size(); i++) {
            menus.get(i).calcularValorMenu();
        }
        
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", menus, 10);
        miCuenta.calcularSubTotal();
        miCuenta.calcularTotal();
        System.out.printf("%s\n", miCuenta);
        


    }
}
