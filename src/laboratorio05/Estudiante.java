/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio05;

/**
 *
 * @author mco_a
 */
public class Estudiante {
    
    private String Nombre;
    private String Apellidos;
    private String DNI;
    
    public Estudiante(){}

    public Estudiante(String Nombre, String Apellidos, String DNI) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public String getTextoLista(){
        return (this.Apellidos + ", " 
                + this.Nombre + " "
                + " | DNI: " + this.DNI);
    }
}
