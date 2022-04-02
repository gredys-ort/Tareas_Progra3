/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listado;

/**
 *
 * @author Usuario
 */
public class alumno {
     private String carnet;
    private String nombre;
    private double promedio;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public alumno(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public alumno() {
    }

    @Override
    public String toString() {
        return "ClsAlumno{" + "carnet=" + carnet + ", nombre=" + nombre + ", promedio=" + promedio + '}';
    }
}
