/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.DataManager;
import utils.Device;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author user1
 */
public class Rechercher extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String titre = "";
        String keyword = request.getParameter("keyword");
        int index = Integer.parseInt(request.getParameter("choixIndex"));
    
         ArrayList<Device> liste =DataManager.getListeDevices(keyword, index);
         
         if(liste.isEmpty()){
           titre = "Pas de résultat trouvé pour '"+keyword+"' ...";
         }else{
           titre = "Résultat de la recherche ...";
         }
        
         request.setAttribute("liste", liste);
         request.setAttribute("titre", titre);
        
        return mapping.findForward(SUCCESS);
    }
}
