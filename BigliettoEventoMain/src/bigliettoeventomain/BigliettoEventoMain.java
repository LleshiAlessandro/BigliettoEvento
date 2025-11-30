/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bigliettoeventomain;

/**
 *
 * @author aless
 */
public class BigliettoEventoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigliettoStandard bS = new BigliettoStandard();
        System.out.println( bS.prezzoTot());
        BigliettoPremium bP = new BigliettoPremium();
        System.out.println(bP.prezzoTot());
        
    }
    
}
