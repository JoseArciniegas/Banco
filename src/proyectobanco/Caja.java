/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import proyectobanco.Cliente;

public class Caja {

    private String cajaP;
    private String cajaE;
    private String cajaN;
    private String Cajan;
    private int tiempo;

    public Caja(String pp, String ee, String nn) {
        cajaP = pp;
        cajaE = ee;
        cajaN = nn;

    }

    public void CajaPrioritaria() {
        Cliente.setPrioritario(1);
        if (Cliente.getPrioritario() == 1) {
            System.out.println("Ha ingresado un cliente prioritario");
        } else {
            System.out.println("El cliente no es prioritario");
        }
        System.out.println("Cliente prioritario atendido en" + tiempo + "segundos");
    }

    public void CajaEmpresarial() {
        Cliente.setEmpresarial(2);
        if (Cliente.getEmpresarial() == 2) {
            System.out.println("Ha ingresado un cliente empresarial");
        } else {
            System.out.println("El cliente no es prioritario");
        }
        System.out.println("Cliente Empresarial atendido en" + tiempo + "segundos");
    }

    public void CajaNormal() {
        Cliente.setNormal(3);
        Cliente.setNormal(4);
        Cliente.setNormal(5);
        if (Cliente.getNormal() == 3) {
            System.out.println("Ha ingresado un cliente normal");
        }
        System.out.println("Cliente normal atendido en" + tiempo + "segundos");
    }

}
