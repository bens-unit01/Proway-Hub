/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *class User
 * @author "Messaoud BENSALEM"
 * @version 1.0  2013-05-19 
 */
public class User {
    
    // attributs 
    private String nom;
    private String prenom;
    private String email1;
    private String email2;
    
    // constructeurs 

    public User() {
    }
    
    // getteurs et setteurs 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
    
    
    //- toString

    @Override
    public String toString() {
        return "User{" + "nom=" + nom + ", prenom=" + prenom + ", email1=" + email1 + ", email2=" + email2 + '}';
    }
    

}
