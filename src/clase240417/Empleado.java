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
public abstract class Empleado extends trabajador {
    protected String nombre;
    protected double salario;

    public Empleado(int id,double salario, String nombre) {
        super(id);
        this.nombre = nombre;
        this.salario = salario;
    }    

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
