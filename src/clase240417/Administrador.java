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
public class Administrador extends Empleado {

    public Administrador(int id, String nombre) {
        super(id, 100, nombre);
    }
    

    @Override
    public double calcularSalario() {
       return this.salario;
    }

    @Override
    public String listarInformacion() {
      return "Administrador " + this.id + " " + this.nombre;
    }    
}
