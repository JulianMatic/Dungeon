/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class Door {
    private int riktning; //vilket håll dörr(arna) är n s ö v
    private boolean låst; //variabel för låst dörr
    
    public Door(int riktning, boolean låst) {
    this.riktning = riktning;
    this.låst = låst;
    
    
    
}

    /**
     * @return the riktning
     */
    public int getRiktning() {
        return riktning;
    }

    /**
     * @param riktning the riktning to set
     */
    public void setRiktning(int riktning) {
        this.riktning = riktning;
    }

    /**
     * @return the låst
     */
    public boolean isLåst() {
        return låst;
    }

    /**
     * @param låst the låst to set
     */
    public void setLåst(boolean låst) {
        this.låst = låst;
    }
}
    