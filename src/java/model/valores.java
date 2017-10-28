/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class valores {
     private int sueldo;
    private int salarioMinimo;
    private int transporte;
    private int prima;
    private int cesantias;
    private int interecesCesantias;
    private int vacaciones;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public int getPrima() {
        return prima;
    }

    public void setPrima(int prima) {
        this.prima = prima;
    }

    public int getCesantias() {
        return cesantias;
    }

    public void setCesantias(int cesantias) {
        this.cesantias = cesantias;
    }

    public int getInterecesCesantias() {
        return interecesCesantias;
    }

    public void setInterecesCesantias(int interecesCesantias) {
        this.interecesCesantias = interecesCesantias;
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    public valores(int sueldo, int salarioMinimo, int transporte, int prima, int cesantias, int interecesCesantias, int vacaciones) {
        this.sueldo = sueldo;
        this.salarioMinimo = salarioMinimo;
        this.transporte = transporte;
        this.prima = prima;
        this.cesantias = cesantias;
        this.interecesCesantias = interecesCesantias;
        this.vacaciones = vacaciones;
    }
}
