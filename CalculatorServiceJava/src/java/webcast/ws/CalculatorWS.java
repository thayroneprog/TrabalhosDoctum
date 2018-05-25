/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcast.ws;

import java.math.BigDecimal;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author thayr
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    /**
     * This is a sample web service operation
     * @param numero1
     * @param numero2
     * @return 
     */
    @WebMethod(operationName = "soma")
    public BigDecimal soma(BigDecimal numero1, BigDecimal numero2) {
        return numero1.add(numero2);
    }
}
