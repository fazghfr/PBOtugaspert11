/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author fauza
 */
public class genericMulti<T1, T2, T3> {
    private T1 data1;
    private T2 data2;
    private T3 data3;
    
    public void setValue(T1 data1, T2 data2, T3 data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
    
    public void printValue(){
        System.out.println("Nama : " +this.data1 +"\nBalance : " +this.data3 +" " +this.data2);
    }
}
