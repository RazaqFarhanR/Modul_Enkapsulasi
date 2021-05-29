/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Razaq Farhan
 */
public class UjiBus {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Bus Bus = new Bus(100);
        Bus.cetakpenumpang();
        System.out.println();
        
        System.out.println("Masukan Password");
        int password = input.nextInt();
        if(password==24){
        Bus.addPenumpang(30);
        Bus.getPenumpang(password);
        Bus.cetakpenumpang();
        
        System.out.println("Rata-raat Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
        }else{
            System.out.println("Password salah");
        }
    }
}
