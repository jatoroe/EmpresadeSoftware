/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase240417;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado{
    private String lenguaje;
    
    public Programador(int id, double salario, String nombre, String lenguaje) {
        super(id, salario, nombre);
        this.lenguaje = lenguaje;
    }

   
    @Override
    public double calcularSalario() {
        double salarioTotal = this.salario;
        if(this.lenguaje.equals("Java")){
            salarioTotal+=(this.salario*0.2);
        }
        return salarioTotal;
    }

    @Override
    public String listarInformacion() {
        return "Programador " + this.id + " " + this.nombre;
    }
    
}
