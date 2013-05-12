/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

    
/**
 *class DataManager
 * @author "Messaoud BENSALEM"
 * @version 1.0  2013-02-20 
 */
public class DataManager {
    
    
    
    public static Connection getConnection()  {
        String url="jdbc:oracle:thin:@oracleadudb1.bdeb.qc.ca:1521:gdna10";
        String user="ug283f03";
        String pwd="bbking456";
        
        

        Connection conn = null;
    
        try{
            
               // Class.forName("oracle.jdbc.OracleDriver");
               // conn = DriverManager.getConnection(url, user, pwd);
            Context context = new InitialContext();
            DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/PollDatasource");
            conn = ds.getConnection();
           

         
         }catch (NamingException ex) {
                System.out.println("probleme chargment des pilotes ...");
                ex.printStackTrace();
         }catch(SQLException e){

                System.out.println("connexion impossible");
                e.printStackTrace();
        }
    
        return conn;
    }
    
    public static void putConnection(Connection conn){
    
    
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("incapable de fermer la connexion");
                e.printStackTrace();
            }
        }     
    }
    
    
    public static  ArrayList getListeDevices(){
            String query =  "SELECT device_id,brand, model, color, price, type FROM t_devices";
            return selectNatif(query);
        }
    public static ArrayList<Device> getListeDevices(String keyword, int index) {
        String query1 = "SELECT device_id,brand, model, color, price, type FROM t_devices where ", query2 = "";
        String lowerKeyword = keyword.toLowerCase();
        switch (index) {
            case 0: query2 = "lower(color) = '"+lowerKeyword+"'"; // recheche par  couleur 
                break;
            case 1:query2 = "lower(brand) = '"+lowerKeyword+"'";   //recheche par  marque 
                break;
            case 2:query2 = "lower(type) = '"+lowerKeyword+"'";  // recheche par type 
                break;
            }
            query1 += query2;
          return selectNatif(query1);
    }

    private static ArrayList selectNatif(String query) {
        ArrayList listeDevices = new ArrayList();
       Connection conn = getConnection();
        if (conn != null) {
            
            ResultSet rs = null;
            Statement statement = null;
            try {
              
                statement = conn.createStatement();
                rs = statement.executeQuery(query);
                Device mob;
                
                while (rs.next()) {
                    mob = new Device();
                    mob.setDeviceId(rs.getString("device_id"));
                    mob.setBrand(rs.getString("brand"));
                    mob.setModel(rs.getString("model"));
                    mob.setColor(rs.getString("color"));
                    mob.setPrice(rs.getDouble("price"));
                     mob.setType(rs.getString("type"));
                    listeDevices.add(mob);
                   
                }
 
            } catch (Exception e) { e.printStackTrace();
            }finally{
                try {
                    rs.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
                putConnection(conn);
            }
    }
    
    return listeDevices;
    }
    public static Device getDetailsDevice(String idDevice){
    
        String strQuery ="";
        Device mob = new Device();
        Connection conn=null;
        conn = getConnection();
        
        if (conn != null) {
            ResultSet rs = null;
            Statement statement = null;
            
            try {
                strQuery = "SELECT device_id, brand, model, color, type, description, qte, price FROM t_devices where device_id=\'"+idDevice+"\'";
                statement = conn.createStatement();
                rs = statement.executeQuery(strQuery);
                
                if (rs.next()) {
                    mob.setDeviceId(rs.getString("device_id"));
                    mob.setBrand(rs.getString("brand"));
                    mob.setModel(rs.getString("model"));
                    mob.setColor(rs.getString("color"));
                    mob.setType(rs.getString("type"));
                    mob.setDescription(rs.getString("description"));
                    mob.setQte(rs.getInt("qte"));
                    mob.setPrice(rs.getDouble("price"));
                }
                
                
            } catch (
                    Exception e){e.printStackTrace();}
            finally{
                try {
                    rs.close();
                    statement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                putConnection(conn);
            }
                    
             
        }
       return mob;
    }

  public static  ArrayList getTop10(){
            String query =  "SELECT device_id,brand, model, color, price, type FROM t_devices";
            
               ArrayList listeDevices = new ArrayList();
       Connection conn = getConnection();
        if (conn != null) {
            
            ResultSet rs = null;
            Statement statement = null;
            try {
              
                statement = conn.createStatement();
                rs = statement.executeQuery(query);
                Device mob;
                int i = 0;
                while (rs.next() && i <10) {
                    mob = new Device();
                    mob.setDeviceId(rs.getString("device_id"));
                    mob.setBrand(rs.getString("brand"));
                    mob.setModel(rs.getString("model"));
                    mob.setColor(rs.getString("color"));
                    mob.setPrice(rs.getDouble("price"));
                     mob.setType(rs.getString("type"));
                    listeDevices.add(mob);
                    i++;
                   
                }
 
            } catch (Exception e) { e.printStackTrace();
            }finally{
                try {
                    rs.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
                putConnection(conn);
            }
             
        }
        return listeDevices;
       }
    
    
}
