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
public class Cella {

    private boolean colpita;
    private Giocatore giocatore;

    public Cella() {
        colpita = false;
        giocatore = Giocatore.NESSUNO;
    }

    /*public Cella(Giocatore g) {
        colpita=true;
        giocatore=g;
    }*/

    public boolean isColpita() {
        return colpita;
    }

    public Giocatore getGiocatore() {
        return giocatore;
    }

    public void setColpisci(Giocatore g) {
        if (!isColpita()) {
            colpita = true;
            giocatore = g;
        }

    }

    @Override
    public String toString() {
        return "" + giocatore;
    }

}
