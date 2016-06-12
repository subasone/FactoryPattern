/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.factorypattern.factory;
import com.leapfrog.factorypattern.concreteclasees.Circle;
import com.leapfrog.factorypattern.concreteclasees.Rectangle;
import com.leapfrog.factorypattern.concreteclasees.Square;
import com.leapfrog.factorypattern.interfaces.Shape;

/**
 *
 * @author onesoft
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
