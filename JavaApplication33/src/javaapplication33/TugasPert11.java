/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author fauza
 */
public class TugasPert11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cobaenum c1 =  cobaenum.RUPIAH;
        c1.cetak();//akan mencetak dari data RUPIAH
        
        c1 = cobaenum.USDOLLAR;
        c1.cetak();//akan mencetak dari data DOLLAR
        
        c1 = cobaenum.EURO;
        c1.cetak();//akan mencetak dari data EURO
        
        genericSingle<String> nama = new genericSingle();
        nama.setValue("Fauzan");
        nama.printValue();
        
        
        genericMulti<String, cobaenum, Integer> datas = new genericMulti();
        datas.setValue("Fauzan", c1, 5000);
        datas.printValue();
        
        
        genericMethod gm =  new genericMethod();
        Integer balance[] = {1000, 2000, 3000};
        String nasabah[] = {"ojan", "mau", "pinter"};
        
        gm.printArr(balance);
        gm.printArr(nasabah);
    }
    
}
