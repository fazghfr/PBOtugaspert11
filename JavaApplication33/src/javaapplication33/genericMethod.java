/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author fauza
 */
public class genericMethod {
    public <T> void printArr(T[] arr){
        for(T arrayitem :  arr){
            System.out.println(arrayitem);
        }
    }
}
