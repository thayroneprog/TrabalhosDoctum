/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

import com.sun.xml.wss.impl.callback.PasswordValidationCallback;
import com.sun.xml.wss.impl.callback.PasswordValidationCallback.PasswordValidator;
import com.sun.xml.wss.impl.callback.PasswordValidationCallback.PlainTextPasswordRequest;



public class CustomValidator implements PasswordValidator {
    @Override
    public boolean validate(PasswordValidationCallback.Request rqst) throws PasswordValidationCallback.PasswordValidationException {
       PlainTextPasswordRequest req;
        req = (PlainTextPasswordRequest)rqst;
       return (req.getUsername().equals("user") && req.getPassword().equals("pwd"));
    }
}
