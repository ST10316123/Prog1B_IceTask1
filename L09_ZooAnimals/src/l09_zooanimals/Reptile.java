/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09_zooanimals;

import java.util.Scanner;

/**
 *
 * @author Abdul
 */
public class Reptile extends Animal {
    
    private double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp=bloodTemp;
    }

    @Override
    public void RecordInput() {
        super.RecordInput();
        System.out.println("\nEnter blood temperature of the reptile>>>");
        bloodTemp=kb.nextDouble();
    }

    @Override
    public void RecordOutput() {
        super.RecordOutput(); 
        System.out.println("Blood Temperature: "+bloodTemp);
    }
     
}
