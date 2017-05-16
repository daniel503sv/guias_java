/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author wilver
 */
public class JsfUtil {
    
    public static void addErrorMessage(String msg)
    {
        FacesMessage facemsg=new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facemsg);
    }
    
    public static void addSuccessError(String msg)
    {
        FacesMessage facemsg=new FacesMessage(FacesMessage.SEVERITY_INFO, msg,msg);
        FacesContext.getCurrentInstance().addMessage(null, facemsg);
        
    }
}
