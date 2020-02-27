package com.newfolder;  
public class product implements java.io.Serializable {
    private String pname = null;
    private String price = null;
    private String qun = null;
    private String desc = null;
 
    public product() {
    }
    public String getpname(){
       return pname;
    }
    public String getprice(){
       return price;
    }
    public String getqun(){
        return qun;
     } 
     public String getdesc(){
        return desc;
     }


    public void setpname(String pname){
       this.pname = pname;
    }
    public void getprice(String price){
        this.price = price;
     }
     public void getqun(String qun){
        this.qun = qun;
     }
     public void getdesc(String desc){
        this.desc = desc;
     }
   
 }