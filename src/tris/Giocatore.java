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
public enum Giocatore {
    NESSUNO, X, O;
    
    @Override
    public String toString() {
        switch (this) {
            case NESSUNO:
                return " -";
            case X:
                return " X" ;
            case O:
                return " O";
            default:
                return "?";
        }
    }
}


