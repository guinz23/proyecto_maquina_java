/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinas_java;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Maquinas_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maquina m1 = new maquina();
        maquina m2 = new maquina();
        int menu = 0;
        int submenu;
        int submenu1;
        int opcion = 0;
        try {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Productora Gabriel" + "\n"
                        + "------------------------------"
                        + "\n"
                        + "1) ingresar el  nombre de las maquinas" + "\n"
                        + "2) Ingresar los productos a producir" + "\n"
                        + "3) Iniciar producion" + "\n"
                        + "4) Mostrar Resultados"
                        + "\n"
                        + "\n"
                        + "0) Salir"));
                switch (opcion) {
                    case 1:
                        do {
                            submenu = Integer.parseInt(JOptionPane.showInputDialog("1)Nombres de la Maquinas" + "\n"
                                    + "\n" + "0) Salir"));
                            switch (submenu) {
                                case 1:
                                    String nombre_maquina1 = JOptionPane.showInputDialog("NOMBRE PARA LA MAQUINA 1 ");
                                    String nombre_maquina2 = JOptionPane.showInputDialog("NOMBRE PARA LA MAQUINA2");
                                    m1.setNombre(nombre_maquina1);
                                    m2.setNombre(nombre_maquina2);
                                    break;
                            }
                        } while (submenu != 0);
                        break;
                    case 2:
                        do {
                            submenu1 = Integer.parseInt(JOptionPane.showInputDialog("Productos a Producir" + "\n"
                                    + "--------------------------------------------" + "\n"
                                    + "Maquinas  disponibles : " + "\t " + m1.getNombre() + "\t  " + m2.getNombre()
                                    + "\n"
                                    + "\n"
                                    + "1) Ingresar el Nombre de los productos"
                                    + "\n"
                                    + "\n"
                                    + "0) Salir"
                                    + "\n"));
                            switch (submenu1) {
                                case 1:
                                      if (m1.getNombre() == null  && m2.getNombre()==null) {
                                            JOptionPane.showMessageDialog(null,"Nombres Requeridos");
                                    }else{
                                        String producto1 = JOptionPane.showInputDialog("INGRESE EL PRIMER PRODUCTO");
                                        String producto2 = JOptionPane.showInputDialog("INGRESE EL SEGUNDO   PRODUCTO");
                                        m1.setProdcto(producto1);
                                        m2.setProdcto(producto2);
                                        break;
                                      }
                                    
                            }
                        } while (submenu1 != 0);
                        break;
                }
            } while (opcion != 0);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
