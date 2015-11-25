package net.wiljoey.openrestaurant;

import com.google.gson.annotations.SerializedName;

/**
 * Created by joe on 2015/11/5.
 */
public class restaurant {
    @SerializedName("Add")
    private String Address;
    private String Name;
    private String Description;
    @SerializedName("Picture1")
    private String Picture;
    @SerializedName("Picdescribe1")
    private String PicDescribe;
    private String Px;
    private String Py;
    private String Website;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPx() {
        return Px;
    }

    public void setPx(String px) {
        Px = px;
    }

    public String getPy() {
        return Py;
    }

    public void setPy(String py) {
        Py = py;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public String getPicDescribe() {
        return PicDescribe;
    }

    public void setPicDescribe(String picDescribe) {
        PicDescribe = picDescribe;
    }
}
