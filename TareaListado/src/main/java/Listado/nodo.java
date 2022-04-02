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
public class nodo {
    alumno dato;
    nodo enlace;

    //cerar en contructo inicial
    public nodo(alumno x) {
        dato = x;
        enlace = null;
    }

    //crear un segundo constructor para crear nodo y enlazar
    public nodo(alumno x, nodo n) {
        dato = x;
        enlace = n;
    }

    public alumno getDato() {
        return dato;
    }

    public nodo getEnlace() {
        return enlace;
    }

    public void setEnlaceNodo(nodo enlace) {
        this.enlace = enlace;
    }

    public nodo() {
    }
}
