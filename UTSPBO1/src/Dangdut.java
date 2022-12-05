/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axioo
 */
public class Dangdut {
    
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut(){
        
    }

    
    void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }

    void song(String via_Vallen, String kopi_Dangdut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
