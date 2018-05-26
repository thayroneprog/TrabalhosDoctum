/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calcular;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author thayr
 */
@WebService(serviceName = "Calcular")
public class Calcular {

    /**
     * Operação de Web service
     * @param numero
     * @return 
     */
    @WebMethod(operationName = "Fatorial")
    public int Fatorial(@WebParam(name = "numero") int numero) {
        //TODO write your implementation code here:
        int fatorial = 0;
        if(numero<=1){
            fatorial = numero;
        }else{
            fatorial = numero * Fatorial(numero - 1);
        }
        return fatorial;
    }
}
