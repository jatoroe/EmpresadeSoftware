/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase240417;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<trabajador> trabajadores;
    
    public Empresa(){
        this.trabajadores = new ArrayList<>();
    }
    public void agregarTrabajador (trabajador t){
        this.trabajadores.add(t);
    }
    
    public double calcularSalarioTotal(){
        double salarioTotal = 0;
        for (trabajador Trabajador : trabajadores) {
            salarioTotal+= Trabajador.calcularSalario();
        }
        return salarioTotal;
    }
    
    public String listarInformacion(){
        String informacion = " ";
        for(trabajador Trabajador: trabajadores){
            informacion+=" "+ Trabajador.listarInformacion();
        }
        return informacion;
    }
}
