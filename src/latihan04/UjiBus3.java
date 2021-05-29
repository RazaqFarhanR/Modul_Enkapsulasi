/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan04;

import java.util.Scanner;

/**
 *
 * @author Razaq Farhan
 */
public class UjiBus3 {
    
    public static void main(String[] abc)
    {
    Scanner input = new Scanner(System.in);
        
        Bus3 Bus = new Bus3(5);
        Bus.cetakpenumpang();
        System.out.println();
        
        System.out.println("Masukan Password");
        int password = input.nextInt();
        if(password==24){
            Bus.addpenumpang(4);
            Bus.getpenumpang(password);
            Bus.cetakpenumpang();
        }else{
            System.out.println("Password salah");
        }
    }
}
