/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import java.util.ArrayList;
import paquete02.*;
import paquete03.*;
/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Menu> menus = new ArrayList<>();
        
        MenuNinios menuNi = new MenuNinios("Niños 01", 2, 1, 1.5 );
        menus.add(menuNi);
        
        MenuNinios menuNi2 = new MenuNinios("Niños 02", 3, 1, 1.50 );
        menus.add(menuNi2);
        
        MenuEco menuEco = new MenuEco("Econo 001", 4, 25);
        menuEco.establecerPorcentajeDescuento(25);
        menus.add(menuEco);
        
        MenuDia menuDia = new MenuDia("Dia 001", 5, 1, 1);
        menus.add(menuDia);
        
        MenuCarta menuCarta = new MenuCarta("Carta 001",6, 1.5, 2, 10 );
        menuCarta.establecerPorcentajeAdicional(10);
        menus.add(menuCarta);
        
        for (int i = 0; i < menus.size(); i++) {
            menus.get(i).calcularValorMenu();
        }
        
        Cuenta cue = new Cuenta("René Elizalde", menus);
        cue.establecerIVA();
        cue.calcularSubTotal();
        cue.calcularTotal();
        
        System.out.print(cue);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu de Niños:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/