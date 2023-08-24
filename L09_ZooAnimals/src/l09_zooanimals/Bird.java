/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09_zooanimals;

/**
 *
 * @author Abdul
 */
public class Bird extends Animal{
    
    private String[] colourArray = {"Grey","White","Black"};
    private int colour;
    private boolean colourValid=false;
    private String FEATHER_COLOUR=
              """
              1 - Grey
              2 - White
              3 - Black
              From the above choices, select a NUMBER for the corresponding colour of the bird's feathers>>>""";

    public Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.colour=colour;
    }

    @Override
    public void RecordInput() {
        super.RecordInput();
        while (!colourValid) {
             System.out.println("\n"+FEATHER_COLOUR);
        colour=kb.nextInt();
            if (colour<1 || colour>colourArray.length) {
                System.out.println("\nInvalid colour selection! Try again!");
            }
            else{ colourValid=true;}
        }
        }

    @Override
    public void RecordOutput() {
        super.RecordOutput();
        if (colourValid) {
            System.out.println("Feather Colour: "+colourArray[colour-1]);
        }
        
    }
    
    
}
