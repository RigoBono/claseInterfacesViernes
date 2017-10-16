/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomina;

/**
 *
 * @author RigoBono
 */
public class Empleado {
    private double salario;
    private int id;
    private String NSS;
    private String Nombre;
    private String marcaToper;
    private boolean familia;
    private String telefono;

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the NSS
     */
    public String getNSS() {
        return NSS;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the marcaToper
     */
    public String getMarcaToper() {
        return marcaToper;
    }

    /**
     * @param marcaToper the marcaToper to set
     */
    public void setMarcaToper(String marcaToper) {
        this.marcaToper = marcaToper;
    }

    /**
     * @return the familia
     */
    public boolean isFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(boolean familia) {
        this.familia = familia;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
