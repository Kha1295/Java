/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapJAVA_ThayPhet_Bai001_002;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CrisKha
 */
public class Bai1_5 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       ArrayList al = new ArrayList();
       do{
           System.out.print("Nhap n: ");
           n=sc.nextInt();
           if(n<0)
           {
               System.out.println("Nhap so n phai lon hon 0!");
           }
       }while(n<0); 
       for(int i=2;i<n;i++){
           if(soNguyenTo(i)==1){
               al.add(i);
           }
       }
       if(al.isEmpty()){
           System.out.println("Khong co so nguyen to nao truoc n!");
       }
       else{
            System.out.println("Cac so nguyen to truoc n la: " + al);
        }
    }
    public static int soNguyenTo(int soA){
        if (soA < 2)    
            return 0;

        for (int i = 2; i <= sqrt((float)soA); i ++)
        {
            if (soA%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
}
