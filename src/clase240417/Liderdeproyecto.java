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
public class Liderdeproyecto extends Programador {
    private ArrayList<Programador> programadores;

    public Liderdeproyecto(int id, double salario, String nombre, String lenguaje) {
        super(id, salario, nombre, lenguaje);
    }
    public void agragarProgramador(Programador p){
        this.programadores.add(p);
    }
    
    @Override
    public double calcularSalario(){
        double salarioTotal = 0;
        salarioTotal +=super.calcularSalario()*(super.calcularSalario()*
                this.programadores.size() * 0.1);
        return salarioTotal;
    }
    @Override
    public String listarInformacion(){
        String informacion = super.listarInformacion();
        informacion+= "Programadores a cargo\n";
        for (Programador programador : programadores){
            informacion+=programador.listarInformacion();
        }
        return informacion;
    }
}
