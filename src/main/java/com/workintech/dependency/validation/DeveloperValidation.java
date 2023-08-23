package com.workintech.dependency.validation;

import com.workintech.dependency.mapping.DeveloperResponse;

public class DeveloperValidation {
    public  static boolean isIdNotValid(int id){
   return id>0;
    }
}
