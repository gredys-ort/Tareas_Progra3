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
public class Lista {
   public nodo primero;//esta sera la cabeza

    public Lista() {
        primero = null;
    }

    
    public Lista insertarCabezaLista(alumno entrada) {
        nodo nuevo;
        nuevo = new nodo(entrada);
        nuevo.enlace = primero;//enlaza nuevo nodo al frente de la lista(lo apunta)
        primero = nuevo;//nueve primero y lo apunta al nodo nuevo
        return this;//retorna la referencia del objeto lista
    }

    public void visualizar() {
        nodo n;
        int k = 0;
        n = primero;
        System.out.println("PROCESO DE INSERTAR ALUMNO POR CABEZA");
        while (n != null) {
            System.out.println(n.dato.getCarnet() + " ");
            System.out.println(n.dato.getNombre() + " ");
            System.out.println(n.dato.getPromedio() + " ");
            System.out.println("--------------------");
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }

    public Lista insertarUltimo(nodo ultimo, alumno entrada) {
        ultimo = new nodo(entrada);

        if (primero == null) {
            primero = ultimo;
        } else {
            nodo aux = primero;
            while (aux.enlace != null) {
                aux = aux.enlace;
            }
            aux.enlace = ultimo;
        }
        return this;
    }

    public nodo buscarLista(String destino) {
        nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino.equals(indice.dato.getCarnet())) {//valorBuscar.equals (indice.dato)
//                System.out.println("prueba de impresion buscador");
                return indice;

            }
        }
        return null;
    }

    //insertar la lista
    public Lista insertarLista(String valorBuscarInsertar, alumno entrada) {
        nodo nuevo, anterior;
        anterior = buscarLista(valorBuscarInsertar);
        if (anterior != null) {
            nuevo = new nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    //buscar por poscicion
    public nodo buscarPoscicion(int poscicion) {
        nodo indice;
        int i;
        if (poscicion < 0) {
            return null;
        }
        indice = primero;
        for (i = 1; (i < poscicion) && (indice != null); i++) {
            indice = indice.enlace;
        }
        return indice;
    }

    public void eliminar(String entrada) {
        nodo actual, anterior;
        boolean encontrado;
        //inicializar los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
        //buscar en el nodo
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato.getCarnet().equals(entrada));//equals
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        //enlazar del nodo anterior con el siguiente nodo
        if (actual != null) {
            //distingue que el nodo no sea la cabeza
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;//ya que es una variable local no es necesario
        }
    }
}
