/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author fauza
 */
public enum cobaenum {
    
    EURO("EUR", 10000), USDOLLAR("USD", 15000),
    RUPIAH("RP", 1);
    
    private String kode;
    private int value;
    
    private cobaenum(String str, int money){
        this.kode = str;
        this.value = money;
    }
    
    
    public void cetak(){
        System.out.println("Simbol Mata Uang : " +this.kode +"\nBernilai : " +this.kode +" " +this.value);
    }
}
