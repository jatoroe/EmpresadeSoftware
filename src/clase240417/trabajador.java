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
public abstract class trabajador {
    protected int id;
    
    public trabajador(int id){
        this.id = id;
    }
    
    public abstract double calcularSalario();
    public abstract String listarInformacion();
}
