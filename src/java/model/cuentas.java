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
public class cuentas {
    
   public int salarioMinimo(int sueldo){
       int salario=sueldo/737717;
       return salario;
   }
   public int Transporte(int salarioMinimo){
       int res=0;
       if(salarioMinimo<2){
           res=83140;
       }
       return res;
   }
   public int Prima(int salario, int dias){
       int prima=(salario*dias)/360;
       return prima;
   }
   public int cesantias(int salario, int dias){
       int cesantias=(salario*dias)/360;
       return cesantias;
   }
   public int InterecesCesantias(int cesantias){
       int intereces=(12*cesantias)/100;
       return intereces;
   }
   public int vacaciones(int salario, int dias){
       int vacaciones=(salario*dias)/720;
       return vacaciones; 
   }
    
    
}
