/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author rahul
 */

  
public class Product extends ActionSupport {  
private String id;  
private String name;  
private String price;  
public String getId() {  
    return id;  
}  
public void setId(String id) {  
    this.id = id;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getPrice() {  
    return price;  
}  
public void setPrice(String price) {  
    this.price = price;  
}  
@Override
 public void validate() {
       if(id==null || id.trim().equals("")) {
         addFieldError("id","The id  is required");
      }else if (name == null || name.trim().equals("")) {
         addFieldError("name","The name is required");
      }else if(price ==null|| price.trim().equals("")){
          addFieldError("price","price field is required");
      }
      
    
 }

@Override
public String execute(){  
    return "success";  
}  
}  