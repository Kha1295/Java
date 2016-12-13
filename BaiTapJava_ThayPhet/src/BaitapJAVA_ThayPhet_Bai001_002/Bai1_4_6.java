/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapJAVA_ThayPhet_Bai001_002;

import static java.lang.Integer.min;
import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author CrisKha
 */
public class Bai1_4_6 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Nhap y: ");
        int y =sc.nextInt();
        int tong=x+y;
        int hieu=x-y;
        int tich=x*y;
        float thuong=(float)x/(float)y;
        System.out.println("Tong cua x va y la:"+tong);
        System.out.println("Hieu cua x va y la:"+hieu);
        System.out.println("Tich cua x va y la:"+tich);
        System.out.println("Thuong cua x va y la:"+thuong);
        int u=UCLN(x,y);
        int b=BSCNN(x,y);
        System.out.println("UCLN cua x va y la:"+u);
        System.out.println("BCNN cua x va y la:"+b);
    }
    public static int UCLN(int a, int b) {
	int mi = min(a,b);
	for (int i = mi; i >= 2; i--) {
		if (a%i == 0 && b%i == 0)
			return i;
	}
	return 0;
    }
    public static int BSCNN(int a, int b) {
	return a*(b/(UCLN(a, b)));
    }
}
