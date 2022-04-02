/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Listado.Lista;
import Listado.alumno;
import Listado.nodo;

/**
 *
 * @author Usuario
 */
public class cl_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista list = new Lista();//instanciamos y creamos lista vacia

        nodo ultimo = null;

        alumno insercabeza1 = new alumno();
        insercabeza1.setCarnet("2024");
        insercabeza1.setNombre("Gredys");
        insercabeza1.setPromedio(69.8);
        list.insertarCabezaLista(insercabeza1);

        alumno insercabeza2 = new alumno();
        insercabeza2.setCarnet("2047");
        insercabeza2.setNombre("Mario");
        insercabeza2.setPromedio(74.6);
        list.insertarCabezaLista(insercabeza2);

        alumno insercabeza3 = new alumno();
        insercabeza3.setCarnet("3054");
        insercabeza3.setNombre("Leslie");
        insercabeza3.setPromedio(82.4);
        list.insertarCabezaLista(insercabeza3);
        
        
        
        alumno insercola1 = new alumno();
        insercola1.setCarnet("1475");
        insercola1.setNombre("Pedro");
        insercola1.setPromedio(90.1);
        list.insertarUltimo(ultimo, insercola1);

        alumno insercola2 = new alumno();
        insercola2.setCarnet("1486");
        insercola2.setNombre("Tomas");
        insercola2.setPromedio(82.2);
        list.insertarUltimo(ultimo, insercola2);

        alumno insercola3 = new alumno();
        insercola3.setCarnet("1494");
        insercola3.setNombre("Erick");
        insercola3.setPromedio(83.3);
        list.insertarUltimo(ultimo, insercola3);
        list.visualizar();

        nodo nodo = new nodo();
        nodo = list.buscarLista("1475");
        System.out.println("*Buscamos Alumno*");
        System.out.println(nodo.getDato());

        System.out.println("Eliminamos Alumno");
        String carnet = "1494";
        nodo = list.buscarLista(carnet);
        list.eliminar(carnet);
        System.out.println("Alumno a Eliminar" + nodo.getDato() + "\n");
        System.out.println("Lista de Alumnos Nuevos");
        list.visualizar();

    }
    
    
}
