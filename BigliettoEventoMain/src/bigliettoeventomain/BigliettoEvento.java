/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigliettoeventomain;


/**
 *
 * @author aless
 */
public class BigliettoEvento {
    private double prezzoBase;
    private String evento;
    private double aggiuntaPrezzo;
    private double x;

    
    public BigliettoEvento(double x){
        this.prezzoBase = 100;
        this.evento = "23/02/2026";
        this.aggiuntaPrezzo = x;
    }
    
    public double prezzoTot(){
        double prezzoTot;
        prezzoTot = prezzoBase + aggiuntaPrezzo;
        return prezzoTot;
    }
    
}
