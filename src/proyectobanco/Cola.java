/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

/**
 *
 * @author Arciniegas
 */
public class Cola {

    NodoCola inicio;
    NodoCola fin;
    int tamaño;

    public Cola() {
        inicio = null;
        fin = null;
        tamaño = 0;
    }

    public Boolean ColaVacia() {
        return inicio == null;
    }

    public void Insertar(int c) {
        NodoCola nuevo = new NodoCola(c);
        if (ColaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamaño++;
    }

    public int SacarCliente() {
        int aux = inicio.cliente;
        inicio = inicio.siguiente;
        tamaño--;
        return aux;
    }

    public int InicioCola() {
        return inicio.cliente;
    }

    public int TamañoCola() {
        return tamaño;
    }
}
