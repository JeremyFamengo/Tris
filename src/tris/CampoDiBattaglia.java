/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

/**
 *
 * @author famengo.jeremy
 */
public class CampoDiBattaglia {
    
    // fare controllo vincita 

    private Cella[] campo;

    public CampoDiBattaglia() {
        campo = new Cella[9];
        for (int i = 0; i < campo.length; i++) {
            campo[i] = new Cella();
        }
        campo[4].setColpisci(Giocatore.X);
    }

    public void stampa() {
        for (int i = 0; i < campo.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(campo[i]);
        }
    }

}
