/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import javax.swing.JOptionPane;
import proyectobanco.Cliente;

/**
 *
 * @author Arciniegas
 */
public class ProyectoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente.setPrioritario(2);
        if(Cliente.getPrioritario()==1){
            System.out.println("El cliente es proritario");
        }else{
            System.out.println("El cliente no es prioritario");
        }
    }
}
