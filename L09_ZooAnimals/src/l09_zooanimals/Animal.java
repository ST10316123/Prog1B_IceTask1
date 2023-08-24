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
public class Animal {
    
    Scanner kb = new Scanner(System.in);
    
   private int IDtag;
   private String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }
   
   public void RecordInput() {
       System.out.println("Enter ID tag number>>>");
       IDtag = kb.nextInt();
       kb.nextLine();
       System.out.println("\nEnter name of species>>>");
       species = kb.nextLine();
       species = species.substring(0, 1).toUpperCase() + species.substring(1);
   }
    
    public void RecordOutput(){
        System.out.println("Recorded details:");
        System.out.println("ID tag number: "+IDtag);
        System.out.println("Species: "+species);
    }
    
    
}
