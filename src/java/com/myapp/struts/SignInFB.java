/*
 * Cette classe est inspiré du site : http://stackoverflow.com/questions/9566988/java-example-how-to-login-with-facebook-account-on-gae-using-oauth
 */

package com.myapp.struts;

/**
 *class SignInFB
 * @author "Messaoud BENSALEM"
 * @version 1.0  2013-05-12 
 */

import org.json.JSONObject;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInFB extends org.apache.struts.action.Action {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {            
        String code = req.getParameter("code");
        if (code == null || code.equals("")) {
            // an error occurred, handle this
        }

        String token = null;
        try {
            String g = "https://graph.facebook.com/oauth/access_token?client_id=293207454144373&redirect_uri=" + URLEncoder.encode("http://myappengineappid.appspot.com/signin_fb.do", "UTF-8") + "&client_secret=533dd055d3280917d59b42ee1c008c63&code=" + code;
            URL u = new URL(g);
            URLConnection c = u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
            String inputLine;
            StringBuffer b = new StringBuffer();
            while ((inputLine = in.readLine()) != null)
                b.append(inputLine + "\n");            
            in.close();
            token = b.toString();
            if (token.startsWith("{"))
                throw new Exception("error on requesting token: " + token + " with code: " + code);
        } catch (Exception e) {
                // an error occurred, handle this
        }

        String graph = null;
        try {
            String g = "https://graph.facebook.com/me?" + token;
            URL u = new URL(g);
            URLConnection c = u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
            String inputLine;
            StringBuffer b = new StringBuffer();
            while ((inputLine = in.readLine()) != null)
                b.append(inputLine + "\n");            
            in.close();
            graph = b.toString();
        } catch (Exception e) {
                // an error occurred, handle this
        }

        String facebookId;
        String firstName;
        String middleNames;
        String lastName;
        String email;
       // Gender gender;
        try {
            JSONObject json = new JSONObject(graph);
            facebookId = json.getString("id");
            firstName = json.getString("first_name");
            if (json.has("middle_name"))
               middleNames = json.getString("middle_name");
            else
                middleNames = null;
            if (middleNames != null && middleNames.equals(""))
                middleNames = null;
            lastName = json.getString("last_name");
            email = json.getString("email");
           /* if (json.has("gender")) {
                String g = json.getString("gender");
                if (g.equalsIgnoreCase("female"))
                    gender = Gender.FEMALE;
                else if (g.equalsIgnoreCase("male"))
                    gender = Gender.MALE;
                else
                    gender = Gender.UNKNOWN;
            } else {
                gender = Gender.UNKNOWN;
            }*/
        } catch (JSONException e) {
            // an error occurred, handle this
        }
     
        
    }
}
