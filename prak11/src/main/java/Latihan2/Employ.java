/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @Created By Diueeel
 */
public class Employ extends Person {
    private String noKaryawan;
    
    //Konstruktor
    public Employ (String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    //Metode
    public void info() {
        System.out.println("No. karyawan : " + this.noKaryawan);
        super.info();
    }
}
