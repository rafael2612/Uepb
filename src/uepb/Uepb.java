/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uepb;

/**
 *
 * @author Home
 */
public class Uepb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Portas p = new Portas();
        p.aberta();
        p.setCor("Azul");
        p.setDmix(2);
        p.setDmiy(2);
        p.setDmiz(8);
        
        Casa c = new Casa();
        c.pintar("Branca");
        c.porta1.aberta = false;
        c.porta2.aberta = true;
        c.porta3.aberta=true;
        System.out.println(c.portasAbertas()+" portas abertas");
        
    }
    
}
