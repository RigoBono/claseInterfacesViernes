/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomina.Desarrollo;

import Nomina.Empleado;

/**
 *
 * @author RigoBono
 */
public class Programador extends Empleado {

    private int nivelGuapura = 100;
    private String[] lenguajes;
    private String marcaPC;
    private String proyecto;

    /**
     * @return the nivelGuapura
     */
    public int getNivelGuapura() {
        return nivelGuapura;
    }

    /**
     * @param nivelGuapura the nivelGuapura to set
     */
    public void setNivelGuapura(int nivelGuapura) {
        this.nivelGuapura = nivelGuapura;
    }

    /**
     * @return the lenguajes
     */
    public String[] getLenguajes() {
        return lenguajes;
    }

    /**
     * @param lenguajes the lenguajes to set
     */
    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    /**
     * @return the marcaPC
     */
    public String getMarcaPC() {
        return marcaPC;
    }

    /**
     * @param marcaPC the marcaPC to set
     */
    public void setMarcaPC(String marcaPC) {
        this.marcaPC = marcaPC;
    }

    /**
     * @return the proyecto
     */
    public String getProyecto() {
        return proyecto;
    }

    /**
     * @param proyecto the proyecto to set
     */
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    
    
}
