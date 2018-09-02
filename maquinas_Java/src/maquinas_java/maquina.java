/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maquinas_java;

/**
 * 
 * @author  juangabriel
 */
public class maquina {
   private String  nombre;
   private String Prodcto;
   private int  horas_produccion;
   private int horas_reparacion;
   private int resultado;
   private int horas_fuera_producion;

    public maquina() {
        
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProdcto() {
        return Prodcto;
    }

    public void setProdcto(String Prodcto) {
        this.Prodcto = Prodcto;
    }

    public int getHoras_produccion() {
        return horas_produccion;
    }

    public void setHoras_produccion(int horas_produccion) {
        this.horas_produccion = horas_produccion;
    }

    public int getHoras_reparacion() {
        return horas_reparacion;
    }

    public void setHoras_reparacion(int horas_reparacion) {
        this.horas_reparacion = horas_reparacion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getHoras_fuera_producion() {
        return horas_fuera_producion;
    }

    public void setHoras_fuera_producion(int horas_fuera_producion) {
        this.horas_fuera_producion = horas_fuera_producion;
    }

    @Override
    public String toString() {
        return "maquina{" + "nombre=" + nombre + ", Prodcto=" + Prodcto + ", horas_produccion=" + horas_produccion + ", horas_reparacion=" + horas_reparacion + ", resultado=" + resultado + ", horas_fuera_producion=" + horas_fuera_producion + '}';
    }
    
}
