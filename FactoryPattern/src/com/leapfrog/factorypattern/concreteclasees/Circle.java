/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.factorypattern.concreteclasees;
import com.leapfrog.factorypattern.interfaces.Shape;

/**
 *
 * @author onesoft
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("Inside Circle :: draw() method.");
    }
    
}
