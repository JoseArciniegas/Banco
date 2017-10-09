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
public class NodoCola {

    int cliente;
    NodoCola siguiente;

    public NodoCola(int tp) {
        cliente = tp;
        siguiente = null;
    }
}
