/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaodonto;

/**
 *
 * @author flaviorgs
 */
public class Dente {
    
    private int num_dente;
    private boolean carie;

    public Dente(int num_dente, boolean carie) {
        this.num_dente = num_dente;
        this.carie = carie;
    }
    
    
    public int getNum_dente() {
        return num_dente;
    }

    public void setNum_dente(int num_dente) {
        this.num_dente = num_dente;
    }

    public boolean isCarie() {
        return carie;
    }

    public void setCarie(boolean carie) {
        this.carie = carie;
    }
    
    
    
    
}
