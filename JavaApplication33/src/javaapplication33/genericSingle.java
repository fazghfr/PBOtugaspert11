/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author fauza
 */
public class genericSingle<T> {
    private T data;
    
    public void setValue(T celldata){
        data = celldata;
    }
    
    public T getValue(){
        return data;
    }
    
    public void printValue(){
        System.out.println(this.getValue());
    }
}
