/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class maintugas {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        System.out.println("masukan banyak tamu: ");
        int h=masuk.nextInt();
        tugas a[]=new tugas[h];
        int c=0;
        do{
            System.out.print("masukan nama: ");
            String n=masuk.next();
            System.out.print("masukan nomor hp: ");
            String b=masuk.next();
            a[c]=new tugas(n,b);
            c++;
            System.out.println("nomor id anda: "+tugas.getcount());     
        } while (c<h);
        System.out.println("============================================");
        for(int i=0;i<h;i++){
            a[i].display();
        }
        System.out.println("total tamu adalah: "+tugas.getcount());
    }
}
