/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapJAVA_ThayPhet_Bai001_002;

import java.util.Scanner;

/**
 *
 * @author CrisKha
 */
public class Bai1_3 {
    public static void main(String[]arr){
        Scanner x=new Scanner(System.in);
        System.out.println("Nhap ma SV:");
        String msv=x.nextLine();
        System.out.println("Nhap ho ten SV:");
        String hten=x.nextLine();
        System.out.println("Nhap tuoi SV:");
        String tuoi=x.nextLine();
        System.out.println("Nhap nam sinh SV:");
        String namsinh=x.nextLine();
        System.out.println("Nhap diem tb SV:");
        String dtb=x.nextLine();
        
        System.out.println("Mssv: "+msv);
        System.out.println("Ho ten: "+hten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Nam sinh: "+namsinh);
        System.out.println("Diem tb: "+dtb);
    }
}
