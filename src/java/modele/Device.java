/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author messaoud BENSALEM 1295650
 */
public class Device {
    
    private String deviceId;
    private String brand;
    private String model;
    private String color;
    private String type;
    private String description;
    private int qte;
    private double price;

   
    // constructeurs

    public Device() {
    }
    

    public Device(String deviceId, String brand, String model, String color, String type, String description, int qte, double price) {
        this.deviceId = deviceId;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.description = description;
        this.qte = qte;
        this.price = price;
        
    }
    
    
    // getteurs et setteurs 

    
     public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    
    // redefinition de toString()

    @Override
    public String toString() {
        return "Device{" + "deviceId=" + deviceId + ", brand=" + brand + ", model=" + model + ", color=" + color + ", type=" + type + ", description=" + description + ", qte=" + qte + ", price=" + price + '}';
    }
    
    
    
    
}
