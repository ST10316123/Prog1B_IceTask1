/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l09_zooanimals;

/**
 *
 * @author Abdul
 */
public class L09_ZooAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bird brd = new Bird(0,"",0);
        Reptile rept = new Reptile(0,"",0);
        
        System.out.println("Bird Input Record: ");
        brd.RecordInput();
     
        
        System.out.println("\nReptile Input Record: ");
        rept.RecordInput();
        
        System.out.println("\nBird:");
        brd.RecordOutput();
        
        System.out.println("\nReptile:");
        rept.RecordOutput();
    }
    
}
