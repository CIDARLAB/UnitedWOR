/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cidarlab.unitedwor.DOM;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author prash
 */
public abstract class Instance {
    
   @Getter
   @Setter
   private String name;
   
   @Getter
   @Setter
   private InstanceType type;
   
   public Instance(String _name, InstanceType _type){
       name = _name;
       type = _type;
   }
    
}
