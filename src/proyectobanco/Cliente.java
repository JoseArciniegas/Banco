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
public class Cliente {
    private static int prioritario;
    private static int empresarial;
    private static int normal;
    
    public Cliente(int p, int e, int n){
        prioritario = p;
        empresarial = e;
        normal = n;
    }  

    /**
     * @return the prioritario
     */
    public static int getPrioritario() {
        return prioritario;
    }

    /**
     * @param aPrioritario the prioritario to set
     */
    public static void setPrioritario(int aPrioritario) {
        prioritario = aPrioritario;
    }

    /**
     * @return the empresarial
     */
    public static int getEmpresarial() {
        return empresarial;
    }

    /**
     * @param aEmpresarial the empresarial to set
     */
    public static void setEmpresarial(int aEmpresarial) {
        empresarial = aEmpresarial;
    }

    /**
     * @return the normal
     */
    public static int getNormal() {
        return normal;
    }

    /**
     * @param aNormal the normal to set
     */
    public static void setNormal(int aNormal) {
        normal = aNormal;
    }
}
