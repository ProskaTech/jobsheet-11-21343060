/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @Created By Diueel
 */
public class DemoOverride2 {
    public static void main(String args[]) {
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
    
}
