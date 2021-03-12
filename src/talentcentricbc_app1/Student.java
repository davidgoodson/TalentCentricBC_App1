/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talentcentricbc_app1;

import java.util.Date;

/**
 *
 * @author david
 */
public class Student {
    //Attributes or Properties
    String name;
    Date dob;
    String regNo;
    String gender;
    double height;
    double weight;
    
    
    //Constructors
    public Student(){        
    }
    
    
    //Behavior or Methods
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
}

