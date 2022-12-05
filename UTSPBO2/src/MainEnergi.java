
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axioo
 */
public class MainEnergi extends Kinetic{

    private static Readable source;
    public static void main(String[]args){
        MainEnergi me = new MainEnergi();
        Scanner input = new Scanner(source:System.in);
        
        System.out.print(s:"Masukkan kecepatan benda = ");
        Double v = input.nextDouble();
        me.setKecepatanBenda(kecepatanBenda:v);
        System.out.println();
        
        System.out.print(s:"Masukkan massa benda = ");
        Double m = input.nextDouble();
        me.setMassaBenda(massaBenda:m);
        System.out.println();
        
        Double ek = 0.5 / me.getMassaBenda()* me.kecepatanBenda * me.kecepatanBenda;
        me.setEk(Ek:ek);
        
        System.out.println("Jadi, hasilnya adalah " + me.getEk() + " J ");
    }
}
